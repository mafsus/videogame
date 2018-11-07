package net.mafsus.videogame;

import net.mafsus.videogame.tests.Tests;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;

import static org.lwjgl.system.MemoryUtil.NULL;


public class Main {

    static long window;
    static int windowHeight =600;
    static int windowWidth=800;
    public static void gameLoop(){

        GL.createCapabilities();

        GL11.glClearColor(1.0f, 0.0f, 0.0f, 0.0f);
        while(!GLFW.glfwWindowShouldClose(window)){

            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);

            GLFW.glfwSwapBuffers(window);


            GLFW.glfwPollEvents();

            Game.getGame().gameLoop();

        }
    }
    public static void entry(){
        initializeGLFW();
        gameLoop();
        GLFW.glfwDestroyWindow(window);
        GLFW.glfwTerminate();
        GLFW.glfwSetErrorCallback(null).free();
    }
    public static void initializeGLFW() {
        GLFW.glfwSetErrorCallback(GLFWErrorCallback.createPrint(System.err));
        if(!GLFW.glfwInit()){
            throw new IllegalStateException("Unable to intialize GLFW!");
        }

        window = GLFW.glfwCreateWindow(windowWidth,windowHeight,"Video Game",NULL,NULL);
        if(window==NULL){
            throw new RuntimeException("Failed to create main window!");
        }
        GLFW.glfwMakeContextCurrent(window);
        GLFW.glfwShowWindow(window);

    }
    public static void main(String[] args){
        Tests.runInitialTests();
        try{
            entry();
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
}
