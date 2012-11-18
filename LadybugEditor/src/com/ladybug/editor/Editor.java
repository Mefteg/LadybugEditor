package com.ladybug.editor;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Editor implements ApplicationListener {
	private OrthographicCamera camera;
	private SpriteBatch batch;
	
	private Stage m_stage;
	
	@Override
	public void create() {		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		camera = new OrthographicCamera(1, h/w);
		batch = new SpriteBatch();
		
		m_stage = new Stage(Global.WINDOW_WIDTH, Global.WINDOW_HEIGHT, true);
		Gdx.input.setInputProcessor(m_stage);
	}

	@Override
	public void dispose() {
		batch.dispose();
		m_stage.dispose();
	}

	@Override
	public void render() {
		float dt = Gdx.graphics.getDeltaTime();
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		batch.setProjectionMatrix(camera.combined);
		
		m_stage.act(dt);
		m_stage.draw();
	}

	@Override
	public void resize(int width, int height) {
		m_stage.setViewport(width, height, true);
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
