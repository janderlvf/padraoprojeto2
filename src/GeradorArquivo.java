import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class GeradorArquivo {
	
	public final void gerarArquivo(String nome, Map<String, Object> propriedades, String tipo)throws IOException{
		
		/*if (tipo.equals("PROPRIEDADES_CRIPTOGRAFADO")) {
			//gera properties
			ProcessaPropriedadeCriptografado propCript = new ProcessaPropriedadeCriptografado();
			bytes = propCript.processaPropriedadeCriptografado(propriedades);
		}else if (tipo.equals("XML_COMPACTADO")) {
		//gera xml
			ProcessaXmlCompactado xml = new ProcessaXmlCompactado();
			bytes = xml.processaXmlCompactado(propriedades);
		} else {
			System.out.println("Desconheço essa opção");
			return;
		}
		*/
		String conteudo = gerarConteudo(propriedades);
		byte[] bytes = processaConteudo(conteudo.getBytes());
		FileOutputStream fileout = new FileOutputStream(nome);
		fileout.write(bytes);
		fileout.close();
	}
	
	public String gerarConteudo(Map<String, Object> propriedades) {
		// TODO Auto-generated method stub
		return "";
	}

	public byte[] processaConteudo(byte[] conteudo) throws IOException {
		// TODO Auto-generated method stub
		return conteudo;
	}

	

}
