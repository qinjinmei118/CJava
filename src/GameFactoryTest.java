import com.factory.cn.FactoryGamePlayer;
import com.product.cn.GamePlayer;

public class GameFactoryTest {
	public static void main(String[] args) {
		FactoryGamePlayer fgp;
		GamePlayer gp;
		fgp = (FactoryGamePlayer)PlayerXml.getBean();// ���������ļ��ͷ������
		gp = fgp.getNewPlayer();
		gp.show();
	}
}
