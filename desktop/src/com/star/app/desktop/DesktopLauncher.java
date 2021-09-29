package com.star.app.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.star.app.StarGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 1280;
		config.height = 720;
		new LwjglApplication(new StarGame(), config);
	}
//	1. Разобраться с кодом
//	2. Добавить герою HP и hitArea
//	3. При столкновении астероида и корабля астероид должен быть унижтожен, а корабль получить урон.
//	4. Отображать HP корабля
}
