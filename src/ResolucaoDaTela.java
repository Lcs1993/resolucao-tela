import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {

	public static void main(String[] args) {
	    
	    Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize();
	    System.out.println("A resolu��o da sua tela � "+dimensao.width+" x "+dimensao.height);

	}

}
