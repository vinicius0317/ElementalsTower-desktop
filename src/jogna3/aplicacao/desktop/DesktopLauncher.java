package jogna3.aplicacao.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import jogna3.aplicacao.ElementalsTower;
import jogna3.aplicacao.helpers.GameInfos;
import jogna3.aplicacao.helpers.GameManage;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "ElemenTower";
		config.width = GameInfos.WIDTH;
		config.height = GameInfos.HEIGHT;
		config.foregroundFPS = GameManage.FPS;
		new LwjglApplication(new ElementalsTower(), config);
	}
}
