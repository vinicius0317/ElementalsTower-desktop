package jogna3.aplicacao.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import jogna3.aplicacao.ElementalsTower;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "ElementalsTower";
		config.width = 800;
		config.height = 650;
		new LwjglApplication(new ElementalsTower(), config);
	}
}
