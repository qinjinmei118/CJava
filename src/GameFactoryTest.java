import com.factory.cn.FactoryGamePlayer;
import com.product.cn.GamePlayer;

public class GameFactoryTest {
	public static void main(String[] args) {
		FactoryGamePlayer fgp;
		GamePlayer gp;
		fgp = (FactoryGamePlayer)PlayerXml.getBean();// 引入配置文件和反射机制
		gp = fgp.getNewPlayer();
		gp.show();
	}
}
