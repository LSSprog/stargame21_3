package com.star.app.game;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.StringBuilder;
import com.star.app.screen.utils.Assets;

public class WorldRenderer {
    private GameController gc;
    private SpriteBatch batch;
    private BitmapFont font32;
    private StringBuilder score;
    private StringBuilder hp;

    public WorldRenderer(GameController gc, SpriteBatch batch) {
        this.gc = gc;
        this.batch = batch;
        this.font32 = Assets.getInstance().getAssetManager().get("fonts/font32.ttf", BitmapFont.class);
        this.score = new StringBuilder();
        this.hp = new StringBuilder();
    }

    public void render() {
        ScreenUtils.clear(0, 0.2f, 0.5f, 1);
        batch.begin();
        gc.getBackground().render(batch);
        gc.getAsteroidController().render(batch);
        gc.getHero().render(batch);
        gc.getBulletController().render(batch);
        score.clear();
        score.append("SCORE: ").append(gc.getHero().getScoreView());
        hp.clear();
        hp.append("HP: ").append(gc.getHero().getHp());
        font32.draw(batch, score,20,700);
        font32.draw(batch, hp, 20, 650);
        batch.end();
    }
}
