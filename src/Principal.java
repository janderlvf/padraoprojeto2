import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args)throws IOException {
		Map<String, Object> mapa = new HashMap<>();
		mapa.put("nome", "Carlos");
		mapa.put("idade",32);
		
		GeradorArquivo1 gerador = new GeradorArquivo1();
		gerador.gerarArquivo("c:\\Gerador\\Cripto.text", mapa, "PROPRIEDADE_CRIPTOGRAFADO");
		
		GeradorArquivo1 gerador1 = new GeradorArquivo1();
		gerador1.gerarArquivo("c:\\Gerador\\XML.zip", mapa, "XML_COMPACTADO");
		//teste de novo
	}

}
