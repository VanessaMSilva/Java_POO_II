package projeto_1_parte_6;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Gerenciadora {

    public File arquivo;
    public File arquivoL;

    ArrayList<ContaBancaria> conta = new ArrayList<>();
    ArrayList<Cliente> cliente = new ArrayList<>();

    public Gerenciadora() {
        
        ClientePJ c = new ClientePJ("vanessa", "silva", "sao jorge,24", "14523698");
        cliente.add(c);
        ClientePF c1 = new ClientePF("ana", "catarina", "boa vista,56", "14523698745");
        cliente.add(c1);

        ContaBancaria cc = new ContaCorrente(12, 34, cliente.get(0), 100); //Instanciar 1 conta corrente (CC) com R$ 1000,00
        conta.add(cc);

        conta.get(0).depositar(1000);

        ContaBancaria cp = new ContaPoupanca(56, 78, cliente.get(1), 0.5);//Instanciar 1 conta poupança (CP) com R$ 500,00
        conta.add(cp);
        conta.get(1).depositar(500);

        conta.get(0).depositar(390);//Depositar R$ 390,00 na CC

        System.out.println(cc.toString());//Imprimir saldo da CC

        conta.get(1).depositar(900);//Depositar R$ 900,00 na CP

        System.out.println(conta.get(1).toString());//Imprimir saldo da CP

        if (conta.get(0).sacar(40, 34))//Sacar R$ 40,00 da CC
        {
            System.out.println("Sacou");
        } else {
            System.out.println("Nao Sacou\n");
        }
        System.out.println(cc.toString());

        if (conta.get(1).sacar(50, 78))//Sacar R$ 50,00 da CP
        {
            System.out.println("Sacou");
        } else {
            System.out.println("Nao Sacou\n");
        }
        System.out.println(cp.toString());
        escreverBin("cadastroConta.bin");
    }

    public void escreverBin(String nomeArq) {
        try {
            FileOutputStream arqEscrita = new FileOutputStream(nomeArq);
            ObjectOutputStream os = new ObjectOutputStream(arqEscrita);
            os.writeObject(conta);

            os.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro dos dados ");
        }
    }

    public void lerBi(String nomeArq) {
        try {
            FileInputStream lerArq = new FileInputStream(nomeArq);
            try (ObjectInputStream lerEntrada = new ObjectInputStream(lerArq)) {
                conta = (ArrayList<ContaBancaria>) lerEntrada.readObject();
            }

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro!!!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro!!!\nClasse nao encontrada");
        }

    }

    public void carregarArquivo(String arq) {
        try {
            arquivo = new File(arquivo + ".txt");
            if (arquivo.exists() == false) {
                arquivo.createNewFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escreverArquivo(String arq) {

        try {
            FileWriter fw = new FileWriter(arquivo,true);
            BufferedWriter out = new BufferedWriter(fw);

            out.append(arq + "\n");
            out.flush();
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String lerArquivo() {
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader bf = new BufferedReader(fr);
            
            String texto = "";
            String linha = bf.readLine();
            
            while(linha != null){
                texto += linha;
                linha = bf.readLine();
            }
           return texto;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }

}
