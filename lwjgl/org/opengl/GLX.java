package org.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import org.lwjgl.PointerBuffer;
import org.lwjgl.opengl.*;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.linux.XVisualInfo;

public class GLX {
	
    /** Unsafe version of: {@link #glXQueryExtensionsString QueryExtensionsString} */
    public static long nglXQueryExtensionsString(long display, int screen) {
        return org.lwjgl.opengl.GLX11.nglXQueryExtensionsString(display, screen);
    }
    /**
     * Returns a string describing which GLX extensions are supported on the connection.
     *
     * @param display the connection to the X server
     * @param screen  the screen number
     */
    @NativeType("const char *")
    public static String glXQueryExtensionsString(@NativeType("Display *") long display, @NativeType("int") int screen) {
        return org.lwjgl.opengl.GLX11.glXQueryExtensionsString(display, screen);
    }
    /** Unsafe version of: {@link #glXGetClientString GetClientString} */
    public static long nglXGetClientString(long display, int name) {
        return org.lwjgl.opengl.GLX11.nglXGetClientString(display, name);
    }
    /**
     * Returns a pointer to a string describing some aspect of the client library.
     *
     * @param display the connection to the X server
     * @param name    the string to query
     */
    @NativeType("const char *")
    public static String glXGetClientString(@NativeType("Display *") long display, @NativeType("int") int name) {
        return org.lwjgl.opengl.GLX11.glXGetClientString(display, name);
    }
    /** Unsafe version of: {@link #glXQueryServerString QueryServerString} */
    public static long nglXQueryServerString(long display, int screen, int name) {
        return org.lwjgl.opengl.GLX11.nglXQueryServerString(display, screen, name);
    }
    /**
     * Returns a pointer to a string describing some aspect of the server's GLX extension.
     *
     * @param display the connection to the X server
     * @param screen  the screen number
     * @param name    the string to query
     */
    @NativeType("const char *")
    public static String glXQueryServerString(@NativeType("Display *") long display, @NativeType("int") int screen, @NativeType("int") int name) {
        return org.lwjgl.opengl.GLX11.glXQueryServerString(display, screen, name);
    }
    /** Returns the display associated with the current context and drawable. */
    @NativeType("Display *")
    public static long glXGetCurrentDisplay() {
        return org.lwjgl.opengl.GLX12.glXGetCurrentDisplay();
    }
    /**
     * Unsafe version of: {@link #glXGetFBConfigs GetFBConfigs}
     *
     * @param nelements returns the number of GLXFBConfigs in the returned list
     */
    public static long nglXGetFBConfigs(long display, int screen, long nelements) {
        return org.lwjgl.opengl.GLX13.nglXGetFBConfigs(display, screen, nelements);
    }
    /**
     * Returns the list of all GLXFBConfigs that are available on the specified screen.
     *
     * @param display the connection to the X server
     * @param screen  the screen number
     */
    @NativeType("GLXFBConfig *")
    public static PointerBuffer glXGetFBConfigs(@NativeType("Display *") long display, int screen) {
        return org.lwjgl.opengl.GLX13.glXGetFBConfigs(display, screen);
    }
    /**
     * Unsafe version of: {@link #glXChooseFBConfig ChooseFBConfig}
     *
     * @param nelements returns the number of GLXFBConfigs matched
     */
    public static long nglXChooseFBConfig(long display, int screen, long attrib_list, long nelements) {
        return org.lwjgl.opengl.GLX13.nglXChooseFBConfig(display, screen, attrib_list, nelements);
    }
    /**
     * Returns a list of GLXFBConfigs that match a list of attributes.
     *
     * @param display     the connection to the X server
     * @param screen      the screen number
     * @param attrib_list a list of attributes terminated with {@code None}
     */
    @NativeType("GLXFBConfig *")
    public static PointerBuffer glXChooseFBConfig(@NativeType("Display *") long display, int screen, @NativeType("const int *") IntBuffer attrib_list) {
        return org.lwjgl.opengl.GLX13.glXChooseFBConfig(display, screen, attrib_list);
    }
    /** Unsafe version of: {@link #glXGetFBConfigAttrib GetFBConfigAttrib} */
    public static int nglXGetFBConfigAttrib(long display, long config, int attribute, long value) {
        return org.lwjgl.opengl.GLX13.nglXGetFBConfigAttrib(display, config, attribute, value);
    }
    /**
     * Queries the value of a GLX attribute for a GLXFBConfig.
     *
     * @param display   the connection to the X server
     * @param config    the GLXFBConfig being queried
     * @param attribute the attribute to query
     * @param value     the attribute value
     */
    public static int glXGetFBConfigAttrib(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, int attribute, @NativeType("int *") IntBuffer value) {
        return org.lwjgl.opengl.GLX13.glXGetFBConfigAttrib(display, config, attribute, value);
    }
    /** Unsafe version of: {@link #glXGetVisualFromFBConfig GetVisualFromFBConfig} */
    public static long nglXGetVisualFromFBConfig(long display, long config) {
        return org.lwjgl.opengl.GLX13.nglXGetVisualFromFBConfig(display, config);
    }
    /**
     * Retrieves the associated visual of a GLXFBConfig.
     *
     * @param display the connection to the X server
     * @param config  the GLXFBConfig
     */
    @NativeType("XVisualInfo *")
    public static XVisualInfo glXGetVisualFromFBConfig(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config) {
        return org.lwjgl.opengl.GLX13.glXGetVisualFromFBConfig(display, config);
    }
    /** Unsafe version of: {@link #glXCreateWindow CreateWindow} */
    public static long nglXCreateWindow(long display, long config, long win, long attrib_list) {
        return org.lwjgl.opengl.GLX13.nglXCreateWindow(display, config, win, attrib_list);
    }
    /**
     * Create an onscreen rendering area from an X Window and a desired GLXFBConfig.
     *
     * @param display     the connection to the X server
     * @param config      the GLXFBConfig
     * @param win         the X Window
     * @param attrib_list a list of attributes terminated with {@code None}
     */
    @NativeType("GLXWindow")
    public static long glXCreateWindow(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, @NativeType("Window") long win, @NativeType("const int *") IntBuffer attrib_list) {
        return org.lwjgl.opengl.GLX13.glXCreateWindow(display, config, win, attrib_list);
    }
    /** Unsafe version of: {@link #glXCreatePixmap CreatePixmap} */
    public static long nglXCreatePixmap(long display, long config, long pixmap, long attrib_list) {
        return org.lwjgl.opengl.GLX13.nglXCreatePixmap(display, config, pixmap, attrib_list);
    }
    /**
     * Creates a GLXPixmap offscreen rendering area from an X Pixmap and a desired GLXFBConfig.
     *
     * @param display     the connection to the X server
     * @param config      the GLXFBConfig
     * @param pixmap      the X Pixmap
     * @param attrib_list a list of attributes terminated with {@code None}
     */
    @NativeType("GLXPixmap")
    public static long glXCreatePixmap(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, @NativeType("Pixmap") long pixmap, @NativeType("const int *") IntBuffer attrib_list) {
        return org.lwjgl.opengl.GLX13.glXCreatePixmap(display, config, pixmap, attrib_list);
    }
    /**
     * Destroys a GLXPixmap.
     *
     * @param display the connection to the X server
     * @param pixmap  the GLXPixmap to destroy
     */
    public static void glXDestroyPixmap(@NativeType("Display *") long display, @NativeType("GLXPixmap") long pixmap) {
        org.lwjgl.opengl.GLX13.glXDestroyPixmap(display, pixmap);
    }
    /** Unsafe version of: {@link #glXCreatePbuffer CreatePbuffer} */
    public static long nglXCreatePbuffer(long display, long config, long attrib_list) {
        return org.lwjgl.opengl.GLX13.nglXCreatePbuffer(display, config, attrib_list);
    }
    /**
     * Creates a GLXPbuffer from a GLXFBConfig.
     *
     * @param display     the connection to the X server
     * @param config      the GLXFBConfig
     * @param attrib_list a list of attributes terminated with {@code None}
     */
    @NativeType("GLXPbuffer")
    public static long glXCreatePbuffer(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, @NativeType("const int *") IntBuffer attrib_list) {
        return org.lwjgl.opengl.GLX13.glXCreatePbuffer(display, config, attrib_list);
    }
    /**
     * Destroys a GLXPbuffer.
     *
     * @param display the connection to the X server
     * @param pbuf    the GLXPbuffer to destroy
     */
    public static void glXDestroyPbuffer(@NativeType("Display *") long display, @NativeType("GLXPbuffer") long pbuf) {
        org.lwjgl.opengl.GLX13.glXDestroyPbuffer(display, pbuf);
    }
    /** Unsafe version of: {@link #glXQueryDrawable QueryDrawable} */
    public static void nglXQueryDrawable(long display, long draw, int attribute, long value) {
        org.lwjgl.opengl.GLX13.nglXQueryDrawable(display, draw, attribute, value);
    }
    /**
     * Queries an attribute associated with a GLXDrawable.
     *
     * @param display   the connection to the X server
     * @param draw      the GLXDrawable being queried
     * @param attribute the attribute to query
     * @param value     returns the attribute value
     */
    public static void glXQueryDrawable(@NativeType("Display *") long display, @NativeType("GLXDrawable") long draw, int attribute, @NativeType("unsigned int *") IntBuffer value) {
        org.lwjgl.opengl.GLX13.glXQueryDrawable(display, draw, attribute, value);
    }
    /**
     * Queries an attribute associated with a GLXDrawable.
     *
     * @param display   the connection to the X server
     * @param draw      the GLXDrawable being queried
     * @param attribute the attribute to query
     */
    @NativeType("void")
    public static int glXQueryDrawable(@NativeType("Display *") long display, @NativeType("GLXDrawable") long draw, @NativeType("int") int attribute) {
        return org.lwjgl.opengl.GLX13.glXQueryDrawable(display, draw, attribute);
    }
    /**
     * Creates an OpenGL rendering context.
     *
     * @param display     the connection to the X server
     * @param config      the GLXFBConfig
     * @param render_type the render type
     * @param share_list  a GLXContext to share objects with
     * @param direct      whether direct rendering is requested
     */
    @NativeType("GLXContext")
    public static long glXCreateNewContext(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, int render_type, @NativeType("GLXContext") long share_list, @NativeType("Bool") boolean direct) {
        return org.lwjgl.opengl.GLX13.glXCreateNewContext(display, config, render_type, share_list, direct);
    }
    /**
     * Makes a GLXContext current in the current thread.
     *
     * @param display the connection to the X server
     * @param draw    the draw GLXDrawable
     * @param read    the read GLXDrawable
     * @param ctx     the GLXContext
     */
    @NativeType("Bool")
    public static boolean glXMakeContextCurrent(@NativeType("Display *") long display, @NativeType("GLXDrawable") long draw, @NativeType("GLXDrawable") long read, @NativeType("GLXContext") long ctx) {
        return org.lwjgl.opengl.GLX13.glXMakeContextCurrent(display, draw, read, ctx);
    }
    /** Returns the current GLXDrawable used for reading in the current thread. */
    @NativeType("GLXDrawable")
    public static long glXGetCurrentReadDrawable() {
        return org.lwjgl.opengl.GLX13.glXGetCurrentReadDrawable();
    }
    /** Unsafe version of: {@link #glXQueryContext QueryContext} */
    public static int nglXQueryContext(long display, long ctx, int attribute, long value) {
        return org.lwjgl.opengl.GLX13.nglXQueryContext(display, ctx, attribute, value);
    }
    /**
     * Queries the value of a GLXContext attribute.
     *
     * @param display   the connection to the X server
     * @param ctx       the GLXContext being queried
     * @param attribute the attribute to query
     * @param value     returns the attribute value
     */
    public static int glXQueryContext(@NativeType("Display *") long display, @NativeType("GLXContext") long ctx, int attribute, @NativeType("int *") IntBuffer value) {
        return org.lwjgl.opengl.GLX13.glXQueryContext(display, ctx, attribute, value);
    }
    /**
     * Selects which GLX events should be received on a GLXDrawable.
     *
     * @param display    the connection to the X server
     * @param draw       the GLXDrawable
     * @param event_mask the selection mask
     */
    public static void glXSelectEvent(@NativeType("Display *") long display, @NativeType("GLXDrawable") long draw, @NativeType("unsigned long") long event_mask) {
        org.lwjgl.opengl.GLX13.glXSelectEvent(display, draw, event_mask);
    }
    /** Unsafe version of: {@link #glXGetSelectedEvent GetSelectedEvent} */
    public static void nglXGetSelectedEvent(long display, long draw, long event_mask) {
        org.lwjgl.opengl.GLX13.nglXGetSelectedEvent(display, draw, event_mask);
    }
    /**
     * Returns which GLX events are selected for a GLXDrawable.
     *
     * @param display    the connection to the X server
     * @param draw       the GLXDrawable
     * @param event_mask returns the selection mask
     */
    public static void glXGetSelectedEvent(@NativeType("Display *") long display, @NativeType("GLXDrawable") long draw, @NativeType("unsigned long *") PointerBuffer event_mask) {
        org.lwjgl.opengl.GLX13.glXGetSelectedEvent(display, draw, event_mask);
    }
    /** Array version of: {@link #glXChooseFBConfig ChooseFBConfig} */
    @NativeType("GLXFBConfig *")
    public static PointerBuffer glXChooseFBConfig(@NativeType("Display *") long display, int screen, @NativeType("const int *") int[] attrib_list) {
        return org.lwjgl.opengl.GLX13.glXChooseFBConfig(display, screen, attrib_list);
    }
    /** Array version of: {@link #glXGetFBConfigAttrib GetFBConfigAttrib} */
    public static int glXGetFBConfigAttrib(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, int attribute, @NativeType("int *") int[] value) {
        return org.lwjgl.opengl.GLX13.glXGetFBConfigAttrib(display, config, attribute, value);
    }
    /** Array version of: {@link #glXCreateWindow CreateWindow} */
    @NativeType("GLXWindow")
    public static long glXCreateWindow(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, @NativeType("Window") long win, @NativeType("const int *") int[] attrib_list) {
        return org.lwjgl.opengl.GLX13.glXCreateWindow(display, config, win, attrib_list);
    }
    /** Array version of: {@link #glXCreatePixmap CreatePixmap} */
    @NativeType("GLXPixmap")
    public static long glXCreatePixmap(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, @NativeType("Pixmap") long pixmap, @NativeType("const int *") int[] attrib_list) {
        return org.lwjgl.opengl.GLX13.glXCreatePixmap(display, config, pixmap, attrib_list);
    }
    /** Array version of: {@link #glXCreatePbuffer CreatePbuffer} */
    @NativeType("GLXPbuffer")
    public static long glXCreatePbuffer(@NativeType("Display *") long display, @NativeType("GLXFBConfig") long config, @NativeType("const int *") int[] attrib_list) {
        return org.lwjgl.opengl.GLX13.glXCreatePbuffer(display, config, attrib_list);
    }
    /** Array version of: {@link #glXQueryDrawable QueryDrawable} */
    public static void glXQueryDrawable(@NativeType("Display *") long display, @NativeType("GLXDrawable") long draw, int attribute, @NativeType("unsigned int *") int[] value) {
        org.lwjgl.opengl.GLX13.glXQueryDrawable(display, draw, attribute, value);
    }
    /** Array version of: {@link #glXQueryContext QueryContext} */
    public static int glXQueryContext(@NativeType("Display *") long display, @NativeType("GLXContext") long ctx, int attribute, @NativeType("int *") int[] value) {
        return org.lwjgl.opengl.GLX13.glXQueryContext(display, ctx, attribute, value);
    }
    /** Unsafe version of: {@link #glXGetProcAddress GetProcAddress} */
    public static long nglXGetProcAddress(long procName) {
        return org.lwjgl.opengl.GLX14.nglXGetProcAddress(procName);
    }
    /**
     * Returns the address of the extension function named by {@code procName}. The pointer returned should be cast to a function pointer type matching the
     * extension function's definition in that extension specification. A return value of {@code NULL} indicates that the specified function does not exist for the
     * implementation.
     * 
     * <p>A non-{@code NULL} return value for {@code glXGetProcAddress} does not guarantee that an extension function is actually supported at runtime. The client must
     * also query {@link GL11#glGetString GetString}({@link GL11#GL_EXTENSIONS}) or {@link GLX11#glXQueryExtensionsString QueryExtensionsString} to determine if an extension is supported by a particular context.</p>
     * 
     * <p>GL function pointers returned by {@code glXGetProcAddress} are independent of the currently bound context and may be used by any context which supports
     * the extension.</p>
     * 
     * <p>{@code glXGetProcAddress} may be queried for all of the following functions:</p>
     * 
     * <ul>
     * <li>All GL and GLX extension functions supported by the implementation (whether those extensions are supported by the current context or not).</li>
     * <li>All core (non-extension) functions in GL and GLX from version 1.0 up to and including the versions of those specifications supported by the
     * implementation, as determined by {@link GL11#glGetString GetString}({@link GL11#GL_VERSION}) and {@link GLX#glXQueryVersion QueryVersion} queries.</li>
     * </ul>
     *
     * @param procName the function name to query
     */
    @NativeType("void *")
    public static long glXGetProcAddress(@NativeType("const GLchar *") ByteBuffer procName) {
        return org.lwjgl.opengl.GLX14.glXGetProcAddress(procName);
    }
    /**
     * Returns the address of the extension function named by {@code procName}. The pointer returned should be cast to a function pointer type matching the
     * extension function's definition in that extension specification. A return value of {@code NULL} indicates that the specified function does not exist for the
     * implementation.
     * 
     * <p>A non-{@code NULL} return value for {@code glXGetProcAddress} does not guarantee that an extension function is actually supported at runtime. The client must
     * also query {@link GL11#glGetString GetString}({@link GL11#GL_EXTENSIONS}) or {@link GLX11#glXQueryExtensionsString QueryExtensionsString} to determine if an extension is supported by a particular context.</p>
     * 
     * <p>GL function pointers returned by {@code glXGetProcAddress} are independent of the currently bound context and may be used by any context which supports
     * the extension.</p>
     * 
     * <p>{@code glXGetProcAddress} may be queried for all of the following functions:</p>
     * 
     * <ul>
     * <li>All GL and GLX extension functions supported by the implementation (whether those extensions are supported by the current context or not).</li>
     * <li>All core (non-extension) functions in GL and GLX from version 1.0 up to and including the versions of those specifications supported by the
     * implementation, as determined by {@link GL11#glGetString GetString}({@link GL11#GL_VERSION}) and {@link GLX#glXQueryVersion QueryVersion} queries.</li>
     * </ul>
     *
     * @param procName the function name to query
     */
    @NativeType("void *")
    public static long glXGetProcAddress(@NativeType("const GLchar *") CharSequence procName) {
        return org.lwjgl.opengl.GLX14.glXGetProcAddress(procName);
    }

}
