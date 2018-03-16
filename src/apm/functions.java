/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.net.*;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class functions {
     public ResultSet execute(String sql,String type)
    {
        //variavel para obter o resultado da consulta sql
      ResultSet rs = null;
      try
      {
        //nome do driver a ser utilizado para conexao com banco de dados
        String myDriver = "org.gjt.mm.mysql.Driver";
        //endereço do banco de dados
        String myUrl = "jdbc:mysql://localhost/apm";
        //inicializando o driver
        Class.forName(myDriver);
        //abrir conexao com banco de dados
        Connection conn = DriverManager.getConnection(myUrl, "root", "");        
        //comando sql para ser executado
        String query = sql; 
        //objeto para executar o comando sql
        Statement st = conn.createStatement();
        
        //se o tipo for insert
        if(type.equals("INSERT"))
        {
            //executeUpdate para inserir dados na tabela
            st.executeUpdate(query);
        }
        else
        {
            //para pegar o retorno do comado sql , exemplo SELECT
            rs = st.executeQuery(query);
        }
        // execute the query, and get a java resultset
       
        
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      //retornando o resultado da consulta
      return rs;
      
    }
     public String sum(String sql)
    {
        String res = "";
        try
        {
            URL url = new URL("http://etecdenovaodessa.com.br/apm/excel.php");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-type","application/x-www-form-urlencoded");
            
            DataOutputStream printer = new DataOutputStream(con.getOutputStream());
            printer.writeBytes("sql="+sql);
            printer.flush();
            printer.close();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
            String line = null;
            while((line = reader.readLine()) != null)
            {
                res += line;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return res;
    }
     public String organizarData(String data)
     {
         String res = "";
         String partes[] = data.split("");
         return res;
     }
         public void send(String nome,String msg)
    {
        try
        {
            URL url = new URL("http://etecdenovaodessa.com.br/apm/msg.php");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-type","application/x-www-form-urlencoded");
            //Java conversar com servidor
            DataOutputStream printer = new DataOutputStream(con.getOutputStream());
            printer.writeBytes("nome="+nome+"&type=write"+"&comando="+msg);
            printer.flush();
            printer.close();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line = null;
            while((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
         public String obs(String sql)
    {
        String res = "";
        try
        {
            URL url = new URL("http://etecdenovaodessa.com.br/apm/obs.php");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-type","application/x-www-form-urlencoded");
            
            DataOutputStream printer = new DataOutputStream(con.getOutputStream());
            printer.writeBytes("sql="+sql);
            printer.flush();
            printer.close();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(),"ISO-8859-1"));
            String line = null;
            while((line = reader.readLine()) != null)
            {
                res += line;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return res;
    }
          public String listObs(String sql)
    {
        String res = "";
        try
        {
            URL url = new URL("http://etecdenovaodessa.com.br/apm/listObs.php");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-type","application/x-www-form-urlencoded");
            
            DataOutputStream printer = new DataOutputStream(con.getOutputStream());
            printer.writeBytes("sql="+sql);
            printer.flush();
            printer.close();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(),"ISO-8859-1"));
            String line = null;
            while((line = reader.readLine()) != null)
            {
                res += line;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return res;
    }
          
         //LOAD DATA INFILE 'C:\\Users\\V\\Desktop\\apm_camisetas.csv' INTO TABLE adesao_camiseta FIELDS TERMINATED BY ";";
    public String listTabela(String sql)
    {
        String res = "";
        try
        {
            URL url = new URL("http://etecdenovaodessa.com.br/apm/listTabela.php");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-type","application/x-www-form-urlencoded");
            
            DataOutputStream printer = new DataOutputStream(con.getOutputStream());
            printer.writeBytes("sql="+sql);
            printer.flush();
            printer.close();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(),"ISO-8859-1"));
            String line = null;
            while((line = reader.readLine()) != null)
            {
                res += line;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return res;
    }
    public String listColunas(String sql)
    {
        String res = "";
        try
        {
            URL url = new URL("http://etecdenovaodessa.com.br/apm/listColunas.php");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-type","application/x-www-form-urlencoded");
            
            DataOutputStream printer = new DataOutputStream(con.getOutputStream());
            printer.writeBytes("sql="+sql);
            printer.flush();
            printer.close();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(),"ISO-8859-1"));
            String line = null;
            while((line = reader.readLine()) != null)
            {
                res += line;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return res;
    }
    public String data(String text,String tipo)
    {
        String res = "";
        String partes[] = text.split("/");
        if(tipo.equals("dia"))
        {
            res = partes[0];
        }
        else if(tipo.equals("mes"))
        {
            res = partes[1];
        }
        else
        {
            res = partes[2];
        }
        return res;
    }
    public void csv() {
        
        String colunas = "";
        int i = 0;
        
        
        String etim_colunas = listColunas("SELECT * FROM adesao_etim");
        String etim_linhas = listTecnico("SELECT * FROM adesao_etim");
        
        String cam_colunas = listColunas("SELECT * FROM adesao_camiseta");
        String cam_linhas = listTabela("SELECT * FROM adesao_camiseta");
        
        String cart_colunas = listColunas("SELECT * FROM carterinha").replace("cod","RM");
        System.out.println("camiseta = "+cam_linhas);
        String cart_linhas = listCarterinha("SELECT * FROM carterinha");
        try {
           
                FileOutputStream fos = new FileOutputStream("Adesoes.csv");
                OutputStreamWriter writer = new OutputStreamWriter(fos, "ISO-8859-1");
                writer.write(etim_colunas + "\n\n" + etim_linhas.replace("&","\n"));
                writer.close();
                
                fos = new FileOutputStream("Adesao_camisetas.csv");
                writer = new OutputStreamWriter(fos, "ISO-8859-1");
                writer.write(cam_colunas + "\n\n" + cam_linhas.replace("&","\n"));
                writer.close();
                
                 fos = new FileOutputStream("Pedido de carterinha.csv");
                writer = new OutputStreamWriter(fos, "ISO-8859-1");
                writer.write(cart_colunas + "\n\n" + cart_linhas.replace("&","\n"));
                writer.close();
                
        } catch (Exception e) 
        {
            System.out.println(e);
        }
        
    }
    public String listPedcam(String sql)
    {
        String res = "";
        try
        {
            URL url = new URL("http://etecdenovaodessa.com.br/apm/listPedCam.php");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-type","application/x-www-form-urlencoded");
            
            DataOutputStream printer = new DataOutputStream(con.getOutputStream());
            printer.writeBytes("sql="+sql);
            printer.flush();
            printer.close();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(),"ISO-8859-1"));
            String line = null;
            while((line = reader.readLine()) != null)
            {
                res += line;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return res;
    }
    public String listValidade(String sql)
    {
        String res = "";
        try
        {
            URL url = new URL("http://etecdenovaodessa.com.br/apm/listValidade.php");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-type","application/x-www-form-urlencoded");
            
            DataOutputStream printer = new DataOutputStream(con.getOutputStream());
            printer.writeBytes("sql="+sql);
            printer.flush();
            printer.close();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(),"ISO-8859-1"));
            String line = null;
            while((line = reader.readLine()) != null)
            {
                res += line;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return res;
    }
    public String listValor(String sql)
    {
        String res = "";
        try
        {
            URL url = new URL("http://etecdenovaodessa.com.br/apm/listValor.php");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-type","application/x-www-form-urlencoded");
            
            DataOutputStream printer = new DataOutputStream(con.getOutputStream());
            printer.writeBytes("sql="+sql);
            printer.flush();
            printer.close();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(),"ISO-8859-1"));
            String line = null;
            while((line = reader.readLine()) != null)
            {
                res += line;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return res;
    }
    public String listCamiseta(String sql)
    {
        String res = "";
        try
        {
            URL url = new URL("http://etecdenovaodessa.com.br/apm/listCamisetas.php");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-type","application/x-www-form-urlencoded");
            
            DataOutputStream printer = new DataOutputStream(con.getOutputStream());
            printer.writeBytes("sql="+sql);
            printer.flush();
            printer.close();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(),"ISO-8859-1"));
            String line = null;
            while((line = reader.readLine()) != null)
            {
                res += line;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return res;
    }
    public String listCarterinha(String sql)
    {
        String res = "";
        try
        {
            URL url = new URL("http://etecdenovaodessa.com.br/apm/listCarterinha.php");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-type","application/x-www-form-urlencoded");
            
            DataOutputStream printer = new DataOutputStream(con.getOutputStream());
            printer.writeBytes("sql="+sql);
            printer.flush();
            printer.close();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(),"ISO-8859-1"));
            String line = null;
            while((line = reader.readLine()) != null)
            {
                res += line;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return res;
    }
    public String listTecnico(String sql)
    {
        String res = "";
        try
        {
            URL url = new URL("http://etecdenovaodessa.com.br/apm/listTecnico.php");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-type","application/x-www-form-urlencoded");
            
            DataOutputStream printer = new DataOutputStream(con.getOutputStream());
            printer.writeBytes("sql="+sql);
            printer.flush();
            printer.close();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(),"ISO-8859-1"));
            String line = null;
            while((line = reader.readLine()) != null)
            {
                res += line;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return res;
    }
     public String listCurso(String sql)
    {
        String res = "";
        try
        {
            URL url = new URL("http://etecdenovaodessa.com.br/apm/listCursos.php");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-type","application/x-www-form-urlencoded");
            
            DataOutputStream printer = new DataOutputStream(con.getOutputStream());
            printer.writeBytes("sql="+sql);
            printer.flush();
            printer.close();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(),"ISO-8859-1"));
            String line = null;
            while((line = reader.readLine()) != null)
            {
                res += line;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return res;
    }
    public void sql(String sql)
    {
        try
        {
            URL url = new URL("http://etecdenovaodessa.com.br/apm/sql.php");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-type","application/x-www-form-urlencoded");
            
            DataOutputStream printer = new DataOutputStream(con.getOutputStream());
            printer.writeBytes("sql="+sql);
            printer.flush();
            printer.close();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line = null;
            while((line = reader.readLine()) != null)
            {
                JOptionPane.showMessageDialog(null, line);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void sql2(String sql)
    {
        try
        {
            URL url = new URL("http://etecdenovaodessa.com.br/apm/sql.php");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-type","application/x-www-form-urlencoded");
            
            DataOutputStream printer = new DataOutputStream(con.getOutputStream());
            printer.writeBytes("sql="+sql);
            printer.flush();
            printer.close();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line = null;
            while((line = reader.readLine()) != null)
            {
                //JOptionPane.showMessageDialog(null, line);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void delete()
    {
        try
        {
            URL url = new URL("http://etecdenovaodessa.com.br/apm/msg.php");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-type","application/x-www-form-urlencoded");
            
            DataOutputStream printer = new DataOutputStream(con.getOutputStream());
            printer.writeBytes("type=delete");
            printer.flush();
            printer.close();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line = null;
            while((line = reader.readLine()) != null)
            {
                
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
