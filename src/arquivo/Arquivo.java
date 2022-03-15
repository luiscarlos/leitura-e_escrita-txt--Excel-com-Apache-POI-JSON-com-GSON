package arquivo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * for(int i = 1; i <=10; i++) { escreverArquivo.write("texto da linha: " + i +
		 * "\n" ); }
		 */
			
			Pessoa pessoa = new Pessoa();
			pessoa.setNome("luis");
			pessoa.setEmail("luis@");
			pessoa.setIdade(35);
			
			Pessoa pessoa1 = new Pessoa();
			pessoa1.setNome("pedro");
			pessoa1.setEmail("pedro@");
			pessoa1.setIdade(34);
			
			Pessoa pessoa2 = new Pessoa();
			pessoa2.setNome("lucas");
			pessoa2.setEmail("lucas@");
			pessoa2.setIdade(35);
			
			File arquivo = new File("C:\\Users\\luis.dasilva\\Documents\\MeusProjetos\\arquivo\\src\\arquivo\\arquivo.txt");
			FileWriter escreverArquivo = new FileWriter(arquivo);
			
			if(!arquivo.exists()) {
				arquivo.createNewFile();
			}
			
			List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
			listaPessoa.add(pessoa);
			listaPessoa.add(pessoa1);
			listaPessoa.add(pessoa2);
			
			for (Pessoa pessoa3 : listaPessoa) {
				escreverArquivo.write(pessoa3.getNome() + ";" + pessoa3.getEmail() + ";" + pessoa3.getIdade() + "\n");
			}
				
			escreverArquivo.flush();
			escreverArquivo.close();
			
	}

}
