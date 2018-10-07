package org.opengl;

import java.nio.*;

import com.badlogic.gdx.Gdx;

public class GL {
	static final com.badlogic.gdx.graphics.GL30 gl = Gdx.gl30;

	public static final int GL_ES_VERSION_2_0 = 1;

	public static final int GL_DEPTH_BUFFER_BIT = 0x00000100;

	public static final int GL_STENCIL_BUFFER_BIT = 0x00000400;

	public static final int GL_COLOR_BUFFER_BIT = 0x00004000;

	public static final int GL_FALSE = 0;

	public static final int GL_TRUE = 1;

	public static final int GL_POINTS = 0x0000;

	public static final int GL_LINES = 0x0001;

	public static final int GL_LINE_LOOP = 0x0002;

	public static final int GL_LINE_STRIP = 0x0003;

	public static final int GL_TRIANGLES = 0x0004;

	public static final int GL_TRIANGLE_STRIP = 0x0005;

	public static final int GL_TRIANGLE_FAN = 0x0006;

	public static final int GL_ZERO = 0;

	public static final int GL_ONE = 1;

	public static final int GL_SRC_COLOR = 0x0300;

	public static final int GL_ONE_MINUS_SRC_COLOR = 0x0301;

	public static final int GL_SRC_ALPHA = 0x0302;

	public static final int GL_ONE_MINUS_SRC_ALPHA = 0x0303;

	public static final int GL_DST_ALPHA = 0x0304;

	public static final int GL_ONE_MINUS_DST_ALPHA = 0x0305;

	public static final int GL_DST_COLOR = 0x0306;

	public static final int GL_ONE_MINUS_DST_COLOR = 0x0307;

	public static final int GL_SRC_ALPHA_SATURATE = 0x0308;

	public static final int GL_FUNC_ADD = 0x8006;

	public static final int GL_BLEND_EQUATION = 0x8009;

	public static final int GL_BLEND_EQUATION_RGB = 0x8009;

	public static final int GL_BLEND_EQUATION_ALPHA = 0x883D;

	public static final int GL_FUNC_SUBTRACT = 0x800A;

	public static final int GL_FUNC_REVERSE_SUBTRACT = 0x800B;

	public static final int GL_BLEND_DST_RGB = 0x80C8;

	public static final int GL_BLEND_SRC_RGB = 0x80C9;

	public static final int GL_BLEND_DST_ALPHA = 0x80CA;

	public static final int GL_BLEND_SRC_ALPHA = 0x80CB;

	public static final int GL_CONSTANT_COLOR = 0x8001;

	public static final int GL_ONE_MINUS_CONSTANT_COLOR = 0x8002;

	public static final int GL_CONSTANT_ALPHA = 0x8003;

	public static final int GL_ONE_MINUS_CONSTANT_ALPHA = 0x8004;

	public static final int GL_BLEND_COLOR = 0x8005;

	public static final int GL_ARRAY_BUFFER = 0x8892;

	public static final int GL_ELEMENT_ARRAY_BUFFER = 0x8893;

	public static final int GL_ARRAY_BUFFER_BINDING = 0x8894;

	public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING = 0x8895;

	public static final int GL_STREAM_DRAW = 0x88E0;

	public static final int GL_STATIC_DRAW = 0x88E4;

	public static final int GL_DYNAMIC_DRAW = 0x88E8;

	public static final int GL_BUFFER_SIZE = 0x8764;

	public static final int GL_BUFFER_USAGE = 0x8765;

	public static final int GL_CURRENT_VERTEX_ATTRIB = 0x8626;

	public static final int GL_FRONT = 0x0404;

	public static final int GL_BACK = 0x0405;

	public static final int GL_FRONT_AND_BACK = 0x0408;

	public static final int GL_TEXTURE_2D = 0x0DE1;

	public static final int GL_CULL_FACE = 0x0B44;

	public static final int GL_BLEND = 0x0BE2;

	public static final int GL_DITHER = 0x0BD0;

	public static final int GL_STENCIL_TEST = 0x0B90;

	public static final int GL_DEPTH_TEST = 0x0B71;

	public static final int GL_SCISSOR_TEST = 0x0C11;

	public static final int GL_POLYGON_OFFSET_FILL = 0x8037;

	public static final int GL_SAMPLE_ALPHA_TO_COVERAGE = 0x809E;

	public static final int GL_SAMPLE_COVERAGE = 0x80A0;

	public static final int GL_NO_ERROR = 0;

	public static final int GL_INVALID_ENUM = 0x0500;

	public static final int GL_INVALID_VALUE = 0x0501;

	public static final int GL_INVALID_OPERATION = 0x0502;

	public static final int GL_OUT_OF_MEMORY = 0x0505;

	public static final int GL_CW = 0x0900;

	public static final int GL_CCW = 0x0901;

	public static final int GL_LINE_WIDTH = 0x0B21;

	public static final int GL_ALIASED_POINT_SIZE_RANGE = 0x846D;

	public static final int GL_ALIASED_LINE_WIDTH_RANGE = 0x846E;

	public static final int GL_CULL_FACE_MODE = 0x0B45;

	public static final int GL_FRONT_FACE = 0x0B46;

	public static final int GL_DEPTH_RANGE = 0x0B70;

	public static final int GL_DEPTH_WRITEMASK = 0x0B72;

	public static final int GL_DEPTH_CLEAR_VALUE = 0x0B73;

	public static final int GL_DEPTH_FUNC = 0x0B74;

	public static final int GL_STENCIL_CLEAR_VALUE = 0x0B91;

	public static final int GL_STENCIL_FUNC = 0x0B92;

	public static final int GL_STENCIL_FAIL = 0x0B94;

	public static final int GL_STENCIL_PASS_DEPTH_FAIL = 0x0B95;

	public static final int GL_STENCIL_PASS_DEPTH_PASS = 0x0B96;

	public static final int GL_STENCIL_REF = 0x0B97;

	public static final int GL_STENCIL_VALUE_MASK = 0x0B93;

	public static final int GL_STENCIL_WRITEMASK = 0x0B98;

	public static final int GL_STENCIL_BACK_FUNC = 0x8800;

	public static final int GL_STENCIL_BACK_FAIL = 0x8801;

	public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL = 0x8802;

	public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS = 0x8803;

	public static final int GL_STENCIL_BACK_REF = 0x8CA3;

	public static final int GL_STENCIL_BACK_VALUE_MASK = 0x8CA4;

	public static final int GL_STENCIL_BACK_WRITEMASK = 0x8CA5;

	public static final int GL_VIEWPORT = 0x0BA2;

	public static final int GL_SCISSOR_BOX = 0x0C10;

	public static final int GL_COLOR_CLEAR_VALUE = 0x0C22;

	public static final int GL_COLOR_WRITEMASK = 0x0C23;

	public static final int GL_UNPACK_ALIGNMENT = 0x0CF5;

	public static final int GL_PACK_ALIGNMENT = 0x0D05;

	public static final int GL_MAX_TEXTURE_SIZE = 0x0D33;

	public static final int GL_MAX_TEXTURE_UNITS = 0x84E2;

	public static final int GL_MAX_VIEWPORT_DIMS = 0x0D3A;

	public static final int GL_SUBPIXEL_BITS = 0x0D50;

	public static final int GL_RED_BITS = 0x0D52;

	public static final int GL_GREEN_BITS = 0x0D53;

	public static final int GL_BLUE_BITS = 0x0D54;

	public static final int GL_ALPHA_BITS = 0x0D55;

	public static final int GL_DEPTH_BITS = 0x0D56;

	public static final int GL_STENCIL_BITS = 0x0D57;

	public static final int GL_POLYGON_OFFSET_UNITS = 0x2A00;

	public static final int GL_POLYGON_OFFSET_FACTOR = 0x8038;

	public static final int GL_TEXTURE_BINDING_2D = 0x8069;

	public static final int GL_SAMPLE_BUFFERS = 0x80A8;

	public static final int GL_SAMPLES = 0x80A9;

	public static final int GL_SAMPLE_COVERAGE_VALUE = 0x80AA;

	public static final int GL_SAMPLE_COVERAGE_INVERT = 0x80AB;

	public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS = 0x86A2;

	public static final int GL_COMPRESSED_TEXTURE_FORMATS = 0x86A3;

	public static final int GL_DONT_CARE = 0x1100;

	public static final int GL_FASTEST = 0x1101;

	public static final int GL_NICEST = 0x1102;

	public static final int GL_GENERATE_MIPMAP = 0x8191;

	public static final int GL_GENERATE_MIPMAP_HINT = 0x8192;

	public static final int GL_BYTE = 0x1400;

	public static final int GL_UNSIGNED_BYTE = 0x1401;

	public static final int GL_SHORT = 0x1402;

	public static final int GL_UNSIGNED_SHORT = 0x1403;

	public static final int GL_INT = 0x1404;

	public static final int GL_UNSIGNED_INT = 0x1405;

	public static final int GL_FLOAT = 0x1406;

	public static final int GL_FIXED = 0x140C;

	public static final int GL_DEPTH_COMPONENT = 0x1902;

	public static final int GL_ALPHA = 0x1906;

	public static final int GL_RGB = 0x1907;

	public static final int GL_RGBA = 0x1908;

	public static final int GL_LUMINANCE = 0x1909;

	public static final int GL_LUMINANCE_ALPHA = 0x190A;

	public static final int GL_UNSIGNED_SHORT_4_4_4_4 = 0x8033;

	public static final int GL_UNSIGNED_SHORT_5_5_5_1 = 0x8034;

	public static final int GL_UNSIGNED_SHORT_5_6_5 = 0x8363;

	public static final int GL_FRAGMENT_SHADER = 0x8B30;

	public static final int GL_VERTEX_SHADER = 0x8B31;

	public static final int GL_MAX_VERTEX_ATTRIBS = 0x8869;

	public static final int GL_MAX_VERTEX_UNIFORM_VECTORS = 0x8DFB;

	public static final int GL_MAX_VARYING_VECTORS = 0x8DFC;

	public static final int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D;

	public static final int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS = 0x8B4C;

	public static final int GL_MAX_TEXTURE_IMAGE_UNITS = 0x8872;

	public static final int GL_MAX_FRAGMENT_UNIFORM_VECTORS = 0x8DFD;

	public static final int GL_SHADER_TYPE = 0x8B4F;

	public static final int GL_DELETE_STATUS = 0x8B80;

	public static final int GL_LINK_STATUS = 0x8B82;

	public static final int GL_VALIDATE_STATUS = 0x8B83;

	public static final int GL_ATTACHED_SHADERS = 0x8B85;

	public static final int GL_ACTIVE_UNIFORMS = 0x8B86;

	public static final int GL_ACTIVE_UNIFORM_MAX_LENGTH = 0x8B87;

	public static final int GL_ACTIVE_ATTRIBUTES = 0x8B89;

	public static final int GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 0x8B8A;

	public static final int GL_SHADING_LANGUAGE_VERSION = 0x8B8C;

	public static final int GL_CURRENT_PROGRAM = 0x8B8D;

	public static final int GL_NEVER = 0x0200;

	public static final int GL_LESS = 0x0201;

	public static final int GL_EQUAL = 0x0202;

	public static final int GL_LEQUAL = 0x0203;

	public static final int GL_GREATER = 0x0204;

	public static final int GL_NOTEQUAL = 0x0205;

	public static final int GL_GEQUAL = 0x0206;

	public static final int GL_ALWAYS = 0x0207;

	public static final int GL_KEEP = 0x1E00;

	public static final int GL_REPLACE = 0x1E01;

	public static final int GL_INCR = 0x1E02;

	public static final int GL_DECR = 0x1E03;

	public static final int GL_INVERT = 0x150A;

	public static final int GL_INCR_WRAP = 0x8507;

	public static final int GL_DECR_WRAP = 0x8508;

	public static final int GL_VENDOR = 0x1F00;

	public static final int GL_RENDERER = 0x1F01;

	public static final int GL_VERSION = 0x1F02;

	public static final int GL_EXTENSIONS = 0x1F03;

	public static final int GL_NEAREST = 0x2600;

	public static final int GL_LINEAR = 0x2601;

	public static final int GL_NEAREST_MIPMAP_NEAREST = 0x2700;

	public static final int GL_LINEAR_MIPMAP_NEAREST = 0x2701;

	public static final int GL_NEAREST_MIPMAP_LINEAR = 0x2702;

	public static final int GL_LINEAR_MIPMAP_LINEAR = 0x2703;

	public static final int GL_TEXTURE_MAG_FILTER = 0x2800;

	public static final int GL_TEXTURE_MIN_FILTER = 0x2801;

	public static final int GL_TEXTURE_WRAP_S = 0x2802;

	public static final int GL_TEXTURE_WRAP_T = 0x2803;

	public static final int GL_TEXTURE = 0x1702;

	public static final int GL_TEXTURE_CUBE_MAP = 0x8513;

	public static final int GL_TEXTURE_BINDING_CUBE_MAP = 0x8514;

	public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515;

	public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 0x8516;

	public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 0x8517;

	public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 0x8518;

	public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 0x8519;

	public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 0x851A;

	public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE = 0x851C;

	public static final int GL_TEXTURE0 = 0x84C0;

	public static final int GL_TEXTURE1 = 0x84C1;

	public static final int GL_TEXTURE2 = 0x84C2;

	public static final int GL_TEXTURE3 = 0x84C3;

	public static final int GL_TEXTURE4 = 0x84C4;

	public static final int GL_TEXTURE5 = 0x84C5;

	public static final int GL_TEXTURE6 = 0x84C6;

	public static final int GL_TEXTURE7 = 0x84C7;

	public static final int GL_TEXTURE8 = 0x84C8;

	public static final int GL_TEXTURE9 = 0x84C9;

	public static final int GL_TEXTURE10 = 0x84CA;

	public static final int GL_TEXTURE11 = 0x84CB;

	public static final int GL_TEXTURE12 = 0x84CC;

	public static final int GL_TEXTURE13 = 0x84CD;

	public static final int GL_TEXTURE14 = 0x84CE;

	public static final int GL_TEXTURE15 = 0x84CF;

	public static final int GL_TEXTURE16 = 0x84D0;

	public static final int GL_TEXTURE17 = 0x84D1;

	public static final int GL_TEXTURE18 = 0x84D2;

	public static final int GL_TEXTURE19 = 0x84D3;

	public static final int GL_TEXTURE20 = 0x84D4;

	public static final int GL_TEXTURE21 = 0x84D5;

	public static final int GL_TEXTURE22 = 0x84D6;

	public static final int GL_TEXTURE23 = 0x84D7;

	public static final int GL_TEXTURE24 = 0x84D8;

	public static final int GL_TEXTURE25 = 0x84D9;

	public static final int GL_TEXTURE26 = 0x84DA;

	public static final int GL_TEXTURE27 = 0x84DB;

	public static final int GL_TEXTURE28 = 0x84DC;

	public static final int GL_TEXTURE29 = 0x84DD;

	public static final int GL_TEXTURE30 = 0x84DE;

	public static final int GL_TEXTURE31 = 0x84DF;

	public static final int GL_ACTIVE_TEXTURE = 0x84E0;

	public static final int GL_REPEAT = 0x2901;

	public static final int GL_CLAMP_TO_EDGE = 0x812F;

	public static final int GL_MIRRORED_REPEAT = 0x8370;

	public static final int GL_FLOAT_VEC2 = 0x8B50;

	public static final int GL_FLOAT_VEC3 = 0x8B51;

	public static final int GL_FLOAT_VEC4 = 0x8B52;

	public static final int GL_INT_VEC2 = 0x8B53;

	public static final int GL_INT_VEC3 = 0x8B54;

	public static final int GL_INT_VEC4 = 0x8B55;

	public static final int GL_BOOL = 0x8B56;

	public static final int GL_BOOL_VEC2 = 0x8B57;

	public static final int GL_BOOL_VEC3 = 0x8B58;

	public static final int GL_BOOL_VEC4 = 0x8B59;

	public static final int GL_FLOAT_MAT2 = 0x8B5A;

	public static final int GL_FLOAT_MAT3 = 0x8B5B;

	public static final int GL_FLOAT_MAT4 = 0x8B5C;

	public static final int GL_SAMPLER_2D = 0x8B5E;

	public static final int GL_SAMPLER_CUBE = 0x8B60;

	public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED = 0x8622;

	public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE = 0x8623;

	public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE = 0x8624;

	public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE = 0x8625;

	public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x886A;

	public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER = 0x8645;

	public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889F;

	public static final int GL_IMPLEMENTATION_COLOR_READ_TYPE = 0x8B9A;

	public static final int GL_IMPLEMENTATION_COLOR_READ_FORMAT = 0x8B9B;

	public static final int GL_COMPILE_STATUS = 0x8B81;

	public static final int GL_INFO_LOG_LENGTH = 0x8B84;

	public static final int GL_SHADER_SOURCE_LENGTH = 0x8B88;

	public static final int GL_SHADER_COMPILER = 0x8DFA;

	public static final int GL_SHADER_BINARY_FORMATS = 0x8DF8;

	public static final int GL_NUM_SHADER_BINARY_FORMATS = 0x8DF9;

	public static final int GL_LOW_FLOAT = 0x8DF0;

	public static final int GL_MEDIUM_FLOAT = 0x8DF1;

	public static final int GL_HIGH_FLOAT = 0x8DF2;

	public static final int GL_LOW_INT = 0x8DF3;

	public static final int GL_MEDIUM_INT = 0x8DF4;

	public static final int GL_HIGH_INT = 0x8DF5;

	public static final int GL_FRAMEBUFFER = 0x8D40;

	public static final int GL_RENDERBUFFER = 0x8D41;

	public static final int GL_RGBA4 = 0x8056;

	public static final int GL_RGB5_A1 = 0x8057;

	public static final int GL_RGB565 = 0x8D62;

	public static final int GL_DEPTH_COMPONENT16 = 0x81A5;

	public static final int GL_STENCIL_INDEX = 0x1901;

	public static final int GL_STENCIL_INDEX8 = 0x8D48;

	public static final int GL_RENDERBUFFER_WIDTH = 0x8D42;

	public static final int GL_RENDERBUFFER_HEIGHT = 0x8D43;

	public static final int GL_RENDERBUFFER_INTERNAL_FORMAT = 0x8D44;

	public static final int GL_RENDERBUFFER_RED_SIZE = 0x8D50;

	public static final int GL_RENDERBUFFER_GREEN_SIZE = 0x8D51;

	public static final int GL_RENDERBUFFER_BLUE_SIZE = 0x8D52;

	public static final int GL_RENDERBUFFER_ALPHA_SIZE = 0x8D53;

	public static final int GL_RENDERBUFFER_DEPTH_SIZE = 0x8D54;

	public static final int GL_RENDERBUFFER_STENCIL_SIZE = 0x8D55;

	public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 0x8CD0;

	public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 0x8CD1;

	public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 0x8CD2;

	public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3;

	public static final int GL_COLOR_ATTACHMENT0 = 0x8CE0;

	public static final int GL_DEPTH_ATTACHMENT = 0x8D00;

	public static final int GL_STENCIL_ATTACHMENT = 0x8D20;

	public static final int GL_NONE = 0;

	public static final int GL_FRAMEBUFFER_COMPLETE = 0x8CD5;

	public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 0x8CD6;

	public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7;

	public static final int GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS = 0x8CD9;

	public static final int GL_FRAMEBUFFER_UNSUPPORTED = 0x8CDD;

	public static final int GL_FRAMEBUFFER_BINDING = 0x8CA6;

	public static final int GL_RENDERBUFFER_BINDING = 0x8CA7;

	public static final int GL_MAX_RENDERBUFFER_SIZE = 0x84E8;

	public static final int GL_INVALID_FRAMEBUFFER_OPERATION = 0x0506;

	public static final int GL_VERTEX_PROGRAM_POINT_SIZE = 0x8642;

	public static final int GL_COVERAGE_BUFFER_BIT_NV = 0x8000;

	public static final int GL_TEXTURE_MAX_ANISOTROPY_EXT = 0x84FE;

	public static final int GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT = 0x84FF;

	public void glActiveTexture(int texture) {
		gl.glActiveTexture(texture);
	}

	public void glBindTexture(int target, int texture) {
		gl.glBindTexture(target, texture);
	}

	public void glBlendFunc(int sfactor, int dfactor) {
		gl.glBlendFunc(sfactor, dfactor);
	}

	public void glClear(int mask) {
		gl.glClear(mask);
	}

	public void glClearColor(float red, float green, float blue, float alpha) {
		gl.glClearColor(red, green, blue, alpha);
	}

	public void glClearDepthf(float depth) {
		gl.glClearDepthf(depth);
	}

	public void glClearStencil(int s) {
		gl.glClearStencil(s);
	}

	public void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
		gl.glColorMask(red, green, blue, alpha);
	}

	public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border,
			int imageSize, Buffer data) {
		gl.glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
	}

	public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height,
			int format, int imageSize, Buffer data) {
		gl.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
	}

	public void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height,
			int border) {
		gl.glCopyTexImage2D(target, level, internalformat, x, y, width, height, border);
	}

	public void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width,
			int height) {
		gl.glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
	}

	public void glCullFace(int mode) {
		gl.glCullFace(mode);
	}

	public void glDeleteTextures(int n, IntBuffer textures) {
		gl.glDeleteTextures(n, textures);
	}

	public void glDeleteTexture(int texture) {
		gl.glDeleteTexture(texture);
	}

	public void glDepthFunc(int func) {
		gl.glDepthFunc(func);
	}

	public void glDepthMask(boolean flag) {
		gl.glDepthMask(flag);
	}

	public void glDepthRangef(float zNear, float zFar) {
		gl.glDepthRangef(zNear, zFar);
	}

	public void glDisable(int cap) {
		gl.glDisable(cap);
	}

	public void glDrawArrays(int mode, int first, int count) {
		gl.glDrawArrays(mode, first, count);
	}

	public void glDrawElements(int mode, int count, int type, Buffer indices) {
		gl.glDrawElements(mode, count, type, indices);
	}

	public void glEnable(int cap) {
		gl.glEnable(cap);
	}

	public void glFinish() {
		gl.glFinish();
	}

	public void glFlush() {
		gl.glFlush();
	}

	public void glFrontFace(int mode) {
		gl.glFrontFace(mode);
	}

	public void glGenTextures(int n, IntBuffer textures) {
		gl.glGenTextures(n, textures);
	}

	public int glGenTexture() {
		return gl.glGenTexture();
	}

	public int glGetError() {
		return gl.glGetError();
	}

	public void glGetIntegerv(int pname, IntBuffer params) {
		gl.glGetIntegerv(pname, params);
	}

	public String glGetString(int name) {
		return gl.glGetString(name);
	}

	public void glHint(int target, int mode) {
		gl.glHint(target, mode);
	}

	public void glLineWidth(float width) {
		gl.glLineWidth(width);
	}

	public void glPixelStorei(int pname, int param) {
		gl.glPixelStorei(pname, param);
	}

	public void glPolygonOffset(float factor, float units) {
		gl.glPolygonOffset(factor, units);
	}

	public void glReadPixels(int x, int y, int width, int height, int format, int type, Buffer pixels) {
		gl.glReadPixels(x, y, width, height, format, type, pixels);
	}

	public void glScissor(int x, int y, int width, int height) {
		gl.glScissor(x, y, width, height);
	}

	public void glStencilFunc(int func, int ref, int mask) {
		gl.glStencilFunc(func, ref, mask);
	}

	public void glStencilMask(int mask) {
		gl.glStencilMask(mask);
	}

	public void glStencilOp(int fail, int zfail, int zpass) {
		gl.glStencilOp(fail, zfail, zpass);
	}

	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format,
			int type, Buffer pixels) {
		gl.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
	}

	public void glTexParameterf(int target, int pname, float param) {
		gl.glTexParameterf(target, pname, param);
	}

	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format,
			int type, Buffer pixels) {
		gl.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	public void glViewport(int x, int y, int width, int height) {
		gl.glViewport(x, y, width, height);
	}

	public void glAttachShader(int program, int shader) {
		gl.glAttachShader(program, shader);
	}

	public void glBindAttribLocation(int program, int index, String name) {
		gl.glBindAttribLocation(program, index, name);
	}

	public void glBindBuffer(int target, int buffer) {
		gl.glBindBuffer(target, buffer);
	}

	public void glBindFramebuffer(int target, int framebuffer) {
		gl.glBindFramebuffer(target, framebuffer);
	}

	public void glBindRenderbuffer(int target, int renderbuffer) {
		gl.glBindRenderbuffer(target, renderbuffer);
	}

	public void glBlendColor(float red, float green, float blue, float alpha) {
		gl.glBlendColor(red, green, blue, alpha);
	}

	public void glBlendEquation(int mode) {
		gl.glBlendEquation(mode);
	}

	public void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
		gl.glBlendEquationSeparate(modeRGB, modeAlpha);
	}

	public void glBlendFuncSeparate(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
		gl.glBlendFuncSeparate(srcRGB, dstRGB, srcAlpha, dstAlpha);
	}

	public void glBufferData(int target, int size, Buffer data, int usage) {
		gl.glBufferData(target, size, data, usage);
	}

	public void glBufferSubData(int target, int offset, int size, Buffer data) {
		gl.glBufferSubData(target, offset, size, data);
	}

	public int glCheckFramebufferStatus(int target) {
		return gl.glCheckFramebufferStatus(target);
	}

	public void glCompileShader(int shader) {
		gl.glCompileShader(shader);
	}

	public int glCreateProgram() {
		return gl.glCreateProgram();
	}

	public int glCreateShader(int type) {
		return gl.glCreateShader(type);
	}

	public void glDeleteBuffer(int buffer) {
		gl.glDeleteBuffer(buffer);
	}

	public void glDeleteBuffers(int n, IntBuffer buffers) {
		gl.glDeleteBuffers(n, buffers);
	}

	public void glDeleteFramebuffer(int framebuffer) {
		gl.glDeleteFramebuffer(framebuffer);
	}

	public void glDeleteFramebuffers(int n, IntBuffer framebuffers) {
		gl.glDeleteFramebuffers(n, framebuffers);
	}

	public void glDeleteProgram(int program) {
		gl.glDeleteProgram(program);
	}

	public void glDeleteRenderbuffer(int renderbuffer) {
		gl.glDeleteRenderbuffer(renderbuffer);
	}

	public void glDeleteRenderbuffers(int n, IntBuffer renderbuffers) {
		gl.glDeleteRenderbuffers(n, renderbuffers);
	}

	public void glDeleteShader(int shader) {
		gl.glDeleteShader(shader);
	}

	public void glDetachShader(int program, int shader) {
		gl.glDetachShader(program, shader);
	}

	public void glDisableVertexAttribArray(int index) {
		gl.glDisableVertexAttribArray(index);
	}

	public void glDrawElements(int mode, int count, int type, int indices) {
		gl.glDrawElements(mode, count, type, indices);
	}

	public void glEnableVertexAttribArray(int index) {
		gl.glEnableVertexAttribArray(index);
	}

	public void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer) {
		gl.glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
	}

	public void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level) {
		gl.glFramebufferTexture2D(target, attachment, textarget, texture, level);
	}

	public int glGenBuffer() {
		return gl.glGenBuffer();
	}

	public void glGenBuffers(int n, IntBuffer buffers) {
		gl.glGenBuffers(n, buffers);
	}

	public void glGenerateMipmap(int target) {
		gl.glGenerateMipmap(target);
	}

	public int glGenFramebuffer() {
		return gl.glGenFramebuffer();
	}

	public void glGenFramebuffers(int n, IntBuffer framebuffers) {
		gl.glGenFramebuffers(n, framebuffers);
	}

	public int glGenRenderbuffer() {
		return gl.glGenRenderbuffer();
	}

	public void glGenRenderbuffers(int n, IntBuffer renderbuffers) {
		gl.glGenRenderbuffers(n, renderbuffers);
	}

	public String glGetActiveAttrib(int program, int index, IntBuffer size, Buffer type) {
		return gl.glGetActiveAttrib(program, index, size, type);
	}

	public String glGetActiveUniform(int program, int index, IntBuffer size, Buffer type) {
		return gl.glGetActiveUniform(program, index, size, type);
	}

	public void glGetAttachedShaders(int program, int maxcount, Buffer count, IntBuffer shaders) {
		gl.glGetAttachedShaders(program, maxcount, count, shaders);
	}

	public int glGetAttribLocation(int program, String name) {
		return gl.glGetAttribLocation(program, name);
	}

	public void glGetBooleanv(int pname, Buffer params) {
		gl.glGetBooleanv(pname, params);
	}

	public void glGetBufferParameteriv(int target, int pname, IntBuffer params) {
		gl.glGetBufferParameteriv(target, pname, params);
	}

	public void glGetFloatv(int pname, FloatBuffer params) {
		gl.glGetFloatv(pname, params);
	}

	public void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, IntBuffer params) {
		gl.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
	}

	public void glGetProgramiv(int program, int pname, IntBuffer params) {
		gl.glGetProgramiv(program, pname, params);
	}

	public String glGetProgramInfoLog(int program) {
		return gl.glGetProgramInfoLog(program);
	}

	public void glGetRenderbufferParameteriv(int target, int pname, IntBuffer params) {
		gl.glGetRenderbufferParameteriv(target, pname, params);
	}

	public void glGetShaderiv(int shader, int pname, IntBuffer params) {
		gl.glGetShaderiv(shader, pname, params);
	}

	public String glGetShaderInfoLog(int shader) {
		return gl.glGetShaderInfoLog(shader);
	}

	public void glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntBuffer range, IntBuffer precision) {
		gl.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
	}

	public void glGetTexParameterfv(int target, int pname, FloatBuffer params) {
		gl.glGetTexParameterfv(target, pname, params);
	}

	public void glGetTexParameteriv(int target, int pname, IntBuffer params) {
		gl.glGetTexParameteriv(target, pname, params);
	}

	public void glGetUniformfv(int program, int location, FloatBuffer params) {
		gl.glGetUniformfv(program, location, params);
	}

	public void glGetUniformiv(int program, int location, IntBuffer params) {
		gl.glGetUniformiv(program, location, params);
	}

	public int glGetUniformLocation(int program, String name) {
		return gl.glGetUniformLocation(program, name);
	}

	public void glGetVertexAttribfv(int index, int pname, FloatBuffer params) {
		gl.glGetVertexAttribfv(index, pname, params);
	}

	public void glGetVertexAttribiv(int index, int pname, IntBuffer params) {
		gl.glGetVertexAttribiv(index, pname, params);
	}

	public void glGetVertexAttribPointerv(int index, int pname, Buffer pointer) {
		gl.glGetVertexAttribPointerv(index, pname, pointer);
	}

	public boolean glIsBuffer(int buffer) {
		return gl.glIsBuffer(buffer);
	}

	public boolean glIsEnabled(int cap) {
		return gl.glIsEnabled(cap);
	}

	public boolean glIsFramebuffer(int framebuffer) {
		return gl.glIsFramebuffer(framebuffer);
	}

	public boolean glIsProgram(int program) {
		return gl.glIsProgram(program);
	}

	public boolean glIsRenderbuffer(int renderbuffer) {
		return gl.glIsRenderbuffer(renderbuffer);
	}

	public boolean glIsShader(int shader) {
		return gl.glIsShader(shader);
	}

	public boolean glIsTexture(int texture) {
		return gl.glIsTexture(texture);
	}

	public void glLinkProgram(int program) {
		gl.glLinkProgram(program);
	}

	public void glReleaseShaderCompiler() {
		gl.glReleaseShaderCompiler();
	}

	public void glRenderbufferStorage(int target, int internalformat, int width, int height) {
		gl.glRenderbufferStorage(target, internalformat, width, height);
	}

	public void glSampleCoverage(float value, boolean invert) {
		gl.glSampleCoverage(value, invert);
	}

	public void glShaderBinary(int n, IntBuffer shaders, int binaryformat, Buffer binary, int length) {
		gl.glShaderBinary(n, shaders, binaryformat, binary, length);
	}

	public void glShaderSource(int shader, String string) {
		gl.glShaderSource(shader, string);
	}

	public void glStencilFuncSeparate(int face, int func, int ref, int mask) {
		gl.glStencilFuncSeparate(face, func, ref, mask);
	}

	public void glStencilMaskSeparate(int face, int mask) {
		gl.glStencilMaskSeparate(face, mask);
	}

	public void glStencilOpSeparate(int face, int fail, int zfail, int zpass) {
		gl.glStencilOpSeparate(face, fail, zfail, zpass);
	}

	public void glTexParameterfv(int target, int pname, FloatBuffer params) {
		gl.glTexParameterfv(target, pname, params);
	}

	public void glTexParameteri(int target, int pname, int param) {
		gl.glTexParameteri(target, pname, param);
	}

	public void glTexParameteriv(int target, int pname, IntBuffer params) {
		gl.glTexParameteriv(target, pname, params);
	}

	public void glUniform1f(int location, float x) {
		gl.glUniform1f(location, x);
	}

	public void glUniform1fv(int location, int count, FloatBuffer v) {
		gl.glUniform1fv(location, count, v);
	}

	public void glUniform1fv(int location, int count, float v[], int offset) {
		gl.glUniform1fv(location, count, v, offset);
	}

	public void glUniform1i(int location, int x) {
		gl.glUniform1i(location, x);
	}

	public void glUniform1iv(int location, int count, IntBuffer v) {
		gl.glUniform1iv(location, count, v);
	}

	public void glUniform1iv(int location, int count, int v[], int offset) {
		gl.glUniform1iv(location, count, v, offset);
	}

	public void glUniform2f(int location, float x, float y) {
		gl.glUniform2f(location, x, y);
	}

	public void glUniform2fv(int location, int count, FloatBuffer v) {
		gl.glUniform2fv(location, count, v);
	}

	public void glUniform2fv(int location, int count, float v[], int offset) {
		gl.glUniform2fv(location, count, v, offset);
	}

	public void glUniform2i(int location, int x, int y) {
		gl.glUniform2i(location, x, y);
	}

	public void glUniform2iv(int location, int count, IntBuffer v) {
		gl.glUniform2iv(location, count, v);
	}

	public void glUniform2iv(int location, int count, int[] v, int offset) {
		gl.glUniform2iv(location, count, v, offset);
	}

	public void glUniform3f(int location, float x, float y, float z) {
		gl.glUniform3f(location, x, y, z);
	}

	public void glUniform3fv(int location, int count, FloatBuffer v) {
		gl.glUniform3fv(location, count, v);
	}

	public void glUniform3fv(int location, int count, float[] v, int offset) {
		gl.glUniform3fv(location, count, v, offset);
	}

	public void glUniform3i(int location, int x, int y, int z) {
		gl.glUniform3i(location, x, y, z);
	}

	public void glUniform3iv(int location, int count, IntBuffer v) {
		gl.glUniform3iv(location, count, v);
	}

	public void glUniform3iv(int location, int count, int v[], int offset) {
		gl.glUniform3iv(location, count, v, offset);
	}

	public void glUniform4f(int location, float x, float y, float z, float w) {
		gl.glUniform4f(location, x, y, z, w);
	}

	public void glUniform4fv(int location, int count, FloatBuffer v) {
		gl.glUniform4fv(location, count, v);
	}

	public void glUniform4fv(int location, int count, float v[], int offset) {
		gl.glUniform4fv(location, count, v, offset);
	}

	public void glUniform4i(int location, int x, int y, int z, int w) {
		gl.glUniform4i(location, x, y, z, w);
	}

	public void glUniform4iv(int location, int count, IntBuffer v) {
		gl.glUniform4iv(location, count, v);
	}

	public void glUniform4iv(int location, int count, int v[], int offset) {
		gl.glUniform4iv(location, count, v, offset);
	}

	public void glUniformMatrix2fv(int location, int count, boolean transpose, FloatBuffer value) {
		gl.glUniformMatrix2fv(location, count, transpose, value);
	}

	public void glUniformMatrix2fv(int location, int count, boolean transpose, float value[], int offset) {
		gl.glUniformMatrix2fv(location, count, transpose, value, offset);
	}

	public void glUniformMatrix3fv(int location, int count, boolean transpose, FloatBuffer value) {
		gl.glUniformMatrix3fv(location, count, transpose, value);
	}

	public void glUniformMatrix3fv(int location, int count, boolean transpose, float value[], int offset) {
		gl.glUniformMatrix3fv(location, count, transpose, value, offset);
	}

	public void glUniformMatrix4fv(int location, int count, boolean transpose, FloatBuffer value) {
		gl.glUniformMatrix4fv(location, count, transpose, value);
	}

	public void glUniformMatrix4fv(int location, int count, boolean transpose, float value[], int offset) {
		gl.glUniformMatrix4fv(location, count, transpose, value, offset);
	}

	public void glUseProgram(int program) {
		gl.glUseProgram(program);
	}

	public void glValidateProgram(int program) {
		gl.glValidateProgram(program);
	}

	public void glVertexAttrib1f(int indx, float x) {
		gl.glVertexAttrib1f(indx, x);
	}

	public void glVertexAttrib1fv(int indx, FloatBuffer values) {
		gl.glVertexAttrib1fv(indx, values);
	}

	public void glVertexAttrib2f(int indx, float x, float y) {
		gl.glVertexAttrib2f(indx, x, y);
	}

	public void glVertexAttrib2fv(int indx, FloatBuffer values) {
		gl.glVertexAttrib2fv(indx, values);
	}

	public void glVertexAttrib3f(int indx, float x, float y, float z) {
		gl.glVertexAttrib3f(indx, x, y, z);
	}

	public void glVertexAttrib3fv(int indx, FloatBuffer values) {
		gl.glVertexAttrib3fv(indx, values);
	}

	public void glVertexAttrib4f(int indx, float x, float y, float z, float w) {
		gl.glVertexAttrib4f(indx, x, y, z, w);
	}

	public void glVertexAttrib4fv(int indx, FloatBuffer values) {
		gl.glVertexAttrib4fv(indx, values);
	}

	/**
	 * In OpenGl core profiles (3.1+), passing a pointer to client memory is not
	 * valid. In 3.0 and later, use the other version of this function instead, pass
	 * a zero-based offset which references the buffer currently bound to
	 * GL_ARRAY_BUFFER.
	 */
	public void glVertexAttribPointer(int indx, int size, int type, boolean normalized, int stride, Buffer ptr) {
		gl.glVertexAttribPointer(indx, size, type, normalized, stride, ptr);
	}

	public void glVertexAttribPointer(int indx, int size, int type, boolean normalized, int stride, int ptr) {
		gl.glVertexAttribPointer(indx, size, type, normalized, stride, ptr);
	}

	public final int GL_READ_BUFFER = 0x0C02;

	public final int GL_UNPACK_ROW_LENGTH = 0x0CF2;

	public final int GL_UNPACK_SKIP_ROWS = 0x0CF3;

	public final int GL_UNPACK_SKIP_PIXELS = 0x0CF4;

	public final int GL_PACK_ROW_LENGTH = 0x0D02;

	public final int GL_PACK_SKIP_ROWS = 0x0D03;

	public final int GL_PACK_SKIP_PIXELS = 0x0D04;

	public final int GL_COLOR = 0x1800;

	public final int GL_DEPTH = 0x1801;

	public final int GL_STENCIL = 0x1802;

	public final int GL_RED = 0x1903;

	public final int GL_RGB8 = 0x8051;

	public final int GL_RGBA8 = 0x8058;

	public final int GL_RGB10_A2 = 0x8059;

	public final int GL_TEXTURE_BINDING_3D = 0x806A;

	public final int GL_UNPACK_SKIP_IMAGES = 0x806D;

	public final int GL_UNPACK_IMAGE_HEIGHT = 0x806E;

	public final int GL_TEXTURE_3D = 0x806F;

	public final int GL_TEXTURE_WRAP_R = 0x8072;

	public final int GL_MAX_3D_TEXTURE_SIZE = 0x8073;

	public final int GL_UNSIGNED_INT_2_10_10_10_REV = 0x8368;

	public final int GL_MAX_ELEMENTS_VERTICES = 0x80E8;

	public final int GL_MAX_ELEMENTS_INDICES = 0x80E9;

	public final int GL_TEXTURE_MIN_LOD = 0x813A;

	public final int GL_TEXTURE_MAX_LOD = 0x813B;

	public final int GL_TEXTURE_BASE_LEVEL = 0x813C;

	public final int GL_TEXTURE_MAX_LEVEL = 0x813D;

	public final int GL_MIN = 0x8007;

	public final int GL_MAX = 0x8008;

	public final int GL_DEPTH_COMPONENT24 = 0x81A6;

	public final int GL_MAX_TEXTURE_LOD_BIAS = 0x84FD;

	public final int GL_TEXTURE_COMPARE_MODE = 0x884C;

	public final int GL_TEXTURE_COMPARE_FUNC = 0x884D;

	public final int GL_CURRENT_QUERY = 0x8865;

	public final int GL_QUERY_RESULT = 0x8866;

	public final int GL_QUERY_RESULT_AVAILABLE = 0x8867;

	public final int GL_BUFFER_MAPPED = 0x88BC;

	public final int GL_BUFFER_MAP_POINTER = 0x88BD;

	public final int GL_STREAM_READ = 0x88E1;

	public final int GL_STREAM_COPY = 0x88E2;

	public final int GL_STATIC_READ = 0x88E5;

	public final int GL_STATIC_COPY = 0x88E6;

	public final int GL_DYNAMIC_READ = 0x88E9;

	public final int GL_DYNAMIC_COPY = 0x88EA;

	public final int GL_MAX_DRAW_BUFFERS = 0x8824;

	public final int GL_DRAW_BUFFER0 = 0x8825;

	public final int GL_DRAW_BUFFER1 = 0x8826;

	public final int GL_DRAW_BUFFER2 = 0x8827;

	public final int GL_DRAW_BUFFER3 = 0x8828;

	public final int GL_DRAW_BUFFER4 = 0x8829;

	public final int GL_DRAW_BUFFER5 = 0x882A;

	public final int GL_DRAW_BUFFER6 = 0x882B;

	public final int GL_DRAW_BUFFER7 = 0x882C;

	public final int GL_DRAW_BUFFER8 = 0x882D;

	public final int GL_DRAW_BUFFER9 = 0x882E;

	public final int GL_DRAW_BUFFER10 = 0x882F;

	public final int GL_DRAW_BUFFER11 = 0x8830;

	public final int GL_DRAW_BUFFER12 = 0x8831;

	public final int GL_DRAW_BUFFER13 = 0x8832;

	public final int GL_DRAW_BUFFER14 = 0x8833;

	public final int GL_DRAW_BUFFER15 = 0x8834;

	public final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = 0x8B49;

	public final int GL_MAX_VERTEX_UNIFORM_COMPONENTS = 0x8B4A;

	public final int GL_SAMPLER_3D = 0x8B5F;

	public final int GL_SAMPLER_2D_SHADOW = 0x8B62;

	public final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT = 0x8B8B;

	public final int GL_PIXEL_PACK_BUFFER = 0x88EB;

	public final int GL_PIXEL_UNPACK_BUFFER = 0x88EC;

	public final int GL_PIXEL_PACK_BUFFER_BINDING = 0x88ED;

	public final int GL_PIXEL_UNPACK_BUFFER_BINDING = 0x88EF;

	public final int GL_FLOAT_MAT2x3 = 0x8B65;

	public final int GL_FLOAT_MAT2x4 = 0x8B66;

	public final int GL_FLOAT_MAT3x2 = 0x8B67;

	public final int GL_FLOAT_MAT3x4 = 0x8B68;

	public final int GL_FLOAT_MAT4x2 = 0x8B69;

	public final int GL_FLOAT_MAT4x3 = 0x8B6A;

	public final int GL_SRGB = 0x8C40;

	public final int GL_SRGB8 = 0x8C41;

	public final int GL_SRGB8_ALPHA8 = 0x8C43;

	public final int GL_COMPARE_REF_TO_TEXTURE = 0x884E;

	public final int GL_MAJOR_VERSION = 0x821B;

	public final int GL_MINOR_VERSION = 0x821C;

	public final int GL_NUM_EXTENSIONS = 0x821D;

	public final int GL_RGBA32F = 0x8814;

	public final int GL_RGB32F = 0x8815;

	public final int GL_RGBA16F = 0x881A;

	public final int GL_RGB16F = 0x881B;

	public final int GL_VERTEX_ATTRIB_ARRAY_INTEGER = 0x88FD;

	public final int GL_MAX_ARRAY_TEXTURE_LAYERS = 0x88FF;

	public final int GL_MIN_PROGRAM_TEXEL_OFFSET = 0x8904;

	public final int GL_MAX_PROGRAM_TEXEL_OFFSET = 0x8905;

	public final int GL_MAX_VARYING_COMPONENTS = 0x8B4B;

	public final int GL_TEXTURE_2D_ARRAY = 0x8C1A;

	public final int GL_TEXTURE_BINDING_2D_ARRAY = 0x8C1D;

	public final int GL_R11F_G11F_B10F = 0x8C3A;

	public final int GL_UNSIGNED_INT_10F_11F_11F_REV = 0x8C3B;

	public final int GL_RGB9_E5 = 0x8C3D;

	public final int GL_UNSIGNED_INT_5_9_9_9_REV = 0x8C3E;

	public final int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 0x8C76;

	public final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE = 0x8C7F;

	public final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS = 0x8C80;

	public final int GL_TRANSFORM_FEEDBACK_VARYINGS = 0x8C83;

	public final int GL_TRANSFORM_FEEDBACK_BUFFER_START = 0x8C84;

	public final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE = 0x8C85;

	public final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 0x8C88;

	public final int GL_RASTERIZER_DISCARD = 0x8C89;

	public final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8C8A;

	public final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS = 0x8C8B;

	public final int GL_INTERLEAVED_ATTRIBS = 0x8C8C;

	public final int GL_SEPARATE_ATTRIBS = 0x8C8D;

	public final int GL_TRANSFORM_FEEDBACK_BUFFER = 0x8C8E;

	public final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = 0x8C8F;

	public final int GL_RGBA32UI = 0x8D70;

	public final int GL_RGB32UI = 0x8D71;

	public final int GL_RGBA16UI = 0x8D76;

	public final int GL_RGB16UI = 0x8D77;

	public final int GL_RGBA8UI = 0x8D7C;

	public final int GL_RGB8UI = 0x8D7D;

	public final int GL_RGBA32I = 0x8D82;

	public final int GL_RGB32I = 0x8D83;

	public final int GL_RGBA16I = 0x8D88;

	public final int GL_RGB16I = 0x8D89;

	public final int GL_RGBA8I = 0x8D8E;

	public final int GL_RGB8I = 0x8D8F;

	public final int GL_RED_INTEGER = 0x8D94;

	public final int GL_RGB_INTEGER = 0x8D98;

	public final int GL_RGBA_INTEGER = 0x8D99;

	public final int GL_SAMPLER_2D_ARRAY = 0x8DC1;

	public final int GL_SAMPLER_2D_ARRAY_SHADOW = 0x8DC4;

	public final int GL_SAMPLER_CUBE_SHADOW = 0x8DC5;

	public final int GL_UNSIGNED_INT_VEC2 = 0x8DC6;

	public final int GL_UNSIGNED_INT_VEC3 = 0x8DC7;

	public final int GL_UNSIGNED_INT_VEC4 = 0x8DC8;

	public final int GL_INT_SAMPLER_2D = 0x8DCA;

	public final int GL_INT_SAMPLER_3D = 0x8DCB;

	public final int GL_INT_SAMPLER_CUBE = 0x8DCC;

	public final int GL_INT_SAMPLER_2D_ARRAY = 0x8DCF;

	public final int GL_UNSIGNED_INT_SAMPLER_2D = 0x8DD2;

	public final int GL_UNSIGNED_INT_SAMPLER_3D = 0x8DD3;

	public final int GL_UNSIGNED_INT_SAMPLER_CUBE = 0x8DD4;

	public final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY = 0x8DD7;

	public final int GL_BUFFER_ACCESS_FLAGS = 0x911F;

	public final int GL_BUFFER_MAP_LENGTH = 0x9120;

	public final int GL_BUFFER_MAP_OFFSET = 0x9121;

	public final int GL_DEPTH_COMPONENT32F = 0x8CAC;

	public final int GL_DEPTH32F_STENCIL8 = 0x8CAD;

	public final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8DAD;

	public final int GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 0x8210;

	public final int GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 0x8211;

	public final int GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE = 0x8212;

	public final int GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 0x8213;

	public final int GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 0x8214;

	public final int GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 0x8215;

	public final int GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 0x8216;

	public final int GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 0x8217;

	public final int GL_FRAMEBUFFER_DEFAULT = 0x8218;

	public final int GL_FRAMEBUFFER_UNDEFINED = 0x8219;

	public final int GL_DEPTH_STENCIL_ATTACHMENT = 0x821A;

	public final int GL_DEPTH_STENCIL = 0x84F9;

	public final int GL_UNSIGNED_INT_24_8 = 0x84FA;

	public final int GL_DEPTH24_STENCIL8 = 0x88F0;

	public final int GL_UNSIGNED_NORMALIZED = 0x8C17;

	public final int GL_DRAW_FRAMEBUFFER_BINDING = GL_FRAMEBUFFER_BINDING;

	public final int GL_READ_FRAMEBUFFER = 0x8CA8;

	public final int GL_DRAW_FRAMEBUFFER = 0x8CA9;

	public final int GL_READ_FRAMEBUFFER_BINDING = 0x8CAA;

	public final int GL_RENDERBUFFER_SAMPLES = 0x8CAB;

	public final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 0x8CD4;

	public final int GL_MAX_COLOR_ATTACHMENTS = 0x8CDF;

	public final int GL_COLOR_ATTACHMENT1 = 0x8CE1;

	public final int GL_COLOR_ATTACHMENT2 = 0x8CE2;

	public final int GL_COLOR_ATTACHMENT3 = 0x8CE3;

	public final int GL_COLOR_ATTACHMENT4 = 0x8CE4;

	public final int GL_COLOR_ATTACHMENT5 = 0x8CE5;

	public final int GL_COLOR_ATTACHMENT6 = 0x8CE6;

	public final int GL_COLOR_ATTACHMENT7 = 0x8CE7;

	public final int GL_COLOR_ATTACHMENT8 = 0x8CE8;

	public final int GL_COLOR_ATTACHMENT9 = 0x8CE9;

	public final int GL_COLOR_ATTACHMENT10 = 0x8CEA;

	public final int GL_COLOR_ATTACHMENT11 = 0x8CEB;

	public final int GL_COLOR_ATTACHMENT12 = 0x8CEC;

	public final int GL_COLOR_ATTACHMENT13 = 0x8CED;

	public final int GL_COLOR_ATTACHMENT14 = 0x8CEE;

	public final int GL_COLOR_ATTACHMENT15 = 0x8CEF;

	public final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 0x8D56;

	public final int GL_MAX_SAMPLES = 0x8D57;

	public final int GL_HALF_FLOAT = 0x140B;

	public final int GL_MAP_READ_BIT = 0x0001;

	public final int GL_MAP_WRITE_BIT = 0x0002;

	public final int GL_MAP_INVALIDATE_RANGE_BIT = 0x0004;

	public final int GL_MAP_INVALIDATE_BUFFER_BIT = 0x0008;

	public final int GL_MAP_FLUSH_EXPLICIT_BIT = 0x0010;

	public final int GL_MAP_UNSYNCHRONIZED_BIT = 0x0020;

	public final int GL_RG = 0x8227;

	public final int GL_RG_INTEGER = 0x8228;

	public final int GL_R8 = 0x8229;

	public final int GL_RG8 = 0x822B;

	public final int GL_R16F = 0x822D;

	public final int GL_R32F = 0x822E;

	public final int GL_RG16F = 0x822F;

	public final int GL_RG32F = 0x8230;

	public final int GL_R8I = 0x8231;

	public final int GL_R8UI = 0x8232;

	public final int GL_R16I = 0x8233;

	public final int GL_R16UI = 0x8234;

	public final int GL_R32I = 0x8235;

	public final int GL_R32UI = 0x8236;

	public final int GL_RG8I = 0x8237;

	public final int GL_RG8UI = 0x8238;

	public final int GL_RG16I = 0x8239;

	public final int GL_RG16UI = 0x823A;

	public final int GL_RG32I = 0x823B;

	public final int GL_RG32UI = 0x823C;

	public final int GL_VERTEX_ARRAY_BINDING = 0x85B5;

	public final int GL_R8_SNORM = 0x8F94;

	public final int GL_RG8_SNORM = 0x8F95;

	public final int GL_RGB8_SNORM = 0x8F96;

	public final int GL_RGBA8_SNORM = 0x8F97;

	public final int GL_SIGNED_NORMALIZED = 0x8F9C;

	public final int GL_PRIMITIVE_RESTART_FIXED_INDEX = 0x8D69;

	public final int GL_COPY_READ_BUFFER = 0x8F36;

	public final int GL_COPY_WRITE_BUFFER = 0x8F37;

	public final int GL_COPY_READ_BUFFER_BINDING = GL_COPY_READ_BUFFER;

	public final int GL_COPY_WRITE_BUFFER_BINDING = GL_COPY_WRITE_BUFFER;

	public final int GL_UNIFORM_BUFFER = 0x8A11;

	public final int GL_UNIFORM_BUFFER_BINDING = 0x8A28;

	public final int GL_UNIFORM_BUFFER_START = 0x8A29;

	public final int GL_UNIFORM_BUFFER_SIZE = 0x8A2A;

	public final int GL_MAX_VERTEX_UNIFORM_BLOCKS = 0x8A2B;

	public final int GL_MAX_FRAGMENT_UNIFORM_BLOCKS = 0x8A2D;

	public final int GL_MAX_COMBINED_UNIFORM_BLOCKS = 0x8A2E;

	public final int GL_MAX_UNIFORM_BUFFER_BINDINGS = 0x8A2F;

	public final int GL_MAX_UNIFORM_BLOCK_SIZE = 0x8A30;

	public final int GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 0x8A31;

	public final int GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 0x8A33;

	public final int GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT = 0x8A34;

	public final int GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 0x8A35;

	public final int GL_ACTIVE_UNIFORM_BLOCKS = 0x8A36;

	public final int GL_UNIFORM_TYPE = 0x8A37;

	public final int GL_UNIFORM_SIZE = 0x8A38;

	public final int GL_UNIFORM_NAME_LENGTH = 0x8A39;

	public final int GL_UNIFORM_BLOCK_INDEX = 0x8A3A;

	public final int GL_UNIFORM_OFFSET = 0x8A3B;

	public final int GL_UNIFORM_ARRAY_STRIDE = 0x8A3C;

	public final int GL_UNIFORM_MATRIX_STRIDE = 0x8A3D;

	public final int GL_UNIFORM_IS_ROW_MAJOR = 0x8A3E;

	public final int GL_UNIFORM_BLOCK_BINDING = 0x8A3F;

	public final int GL_UNIFORM_BLOCK_DATA_SIZE = 0x8A40;

	public final int GL_UNIFORM_BLOCK_NAME_LENGTH = 0x8A41;

	public final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS = 0x8A42;

	public final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 0x8A43;

	public final int GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 0x8A44;

	public final int GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 0x8A46;

	public final int GL_INVALID_INDEX = -1;

	public final int GL_MAX_VERTEX_OUTPUT_COMPONENTS = 0x9122;

	public final int GL_MAX_FRAGMENT_INPUT_COMPONENTS = 0x9125;

	public final int GL_MAX_SERVER_WAIT_TIMEOUT = 0x9111;

	public final int GL_OBJECT_TYPE = 0x9112;

	public final int GL_SYNC_CONDITION = 0x9113;

	public final int GL_SYNC_STATUS = 0x9114;

	public final int GL_SYNC_FLAGS = 0x9115;

	public final int GL_SYNC_FENCE = 0x9116;

	public final int GL_SYNC_GPU_COMMANDS_COMPLETE = 0x9117;

	public final int GL_UNSIGNALED = 0x9118;

	public final int GL_SIGNALED = 0x9119;

	public final int GL_ALREADY_SIGNALED = 0x911A;

	public final int GL_TIMEOUT_EXPIRED = 0x911B;

	public final int GL_CONDITION_SATISFIED = 0x911C;

	public final int GL_WAIT_FAILED = 0x911D;

	public final int GL_SYNC_FLUSH_COMMANDS_BIT = 0x00000001;

	public final long GL_TIMEOUT_IGNORED = -1;

	public final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR = 0x88FE;

	public final int GL_ANY_SAMPLES_PASSED = 0x8C2F;

	public final int GL_ANY_SAMPLES_PASSED_CONSERVATIVE = 0x8D6A;

	public final int GL_SAMPLER_BINDING = 0x8919;

	public final int GL_RGB10_A2UI = 0x906F;

	public final int GL_TEXTURE_SWIZZLE_R = 0x8E42;

	public final int GL_TEXTURE_SWIZZLE_G = 0x8E43;

	public final int GL_TEXTURE_SWIZZLE_B = 0x8E44;

	public final int GL_TEXTURE_SWIZZLE_A = 0x8E45;

	public final int GL_GREEN = 0x1904;

	public final int GL_BLUE = 0x1905;

	public final int GL_INT_2_10_10_10_REV = 0x8D9F;

	public final int GL_TRANSFORM_FEEDBACK = 0x8E22;

	public final int GL_TRANSFORM_FEEDBACK_PAUSED = 0x8E23;

	public final int GL_TRANSFORM_FEEDBACK_ACTIVE = 0x8E24;

	public final int GL_TRANSFORM_FEEDBACK_BINDING = 0x8E25;

	public final int GL_PROGRAM_BINARY_RETRIEVABLE_HINT = 0x8257;

	public final int GL_PROGRAM_BINARY_LENGTH = 0x8741;

	public final int GL_NUM_PROGRAM_BINARY_FORMATS = 0x87FE;

	public final int GL_PROGRAM_BINARY_FORMATS = 0x87FF;

	public final int GL_COMPRESSED_R11_EAC = 0x9270;

	public final int GL_COMPRESSED_SIGNED_R11_EAC = 0x9271;

	public final int GL_COMPRESSED_RG11_EAC = 0x9272;

	public final int GL_COMPRESSED_SIGNED_RG11_EAC = 0x9273;

	public final int GL_COMPRESSED_RGB8_ETC2 = 0x9274;

	public final int GL_COMPRESSED_SRGB8_ETC2 = 0x9275;

	public final int GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9276;

	public final int GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9277;

	public final int GL_COMPRESSED_RGBA8_ETC2_EAC = 0x9278;

	public final int GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC = 0x9279;

	public final int GL_TEXTURE_IMMUTABLE_FORMAT = 0x912F;

	public final int GL_MAX_ELEMENT_INDEX = 0x8D6B;

	public final int GL_NUM_SAMPLE_COUNTS = 0x9380;

	public final int GL_TEXTURE_IMMUTABLE_LEVELS = 0x82DF;

	public void glReadBuffer(int mode) {
		gl.glReadBuffer(mode);
	}

	public void glDrawRangeElements(int mode, int start, int end, int count, int type, java.nio.Buffer indices) {
		gl.glDrawRangeElements(mode, start, end, count, type, indices);
	}

	public void glDrawRangeElements(int mode, int start, int end, int count, int type, int offset) {
		gl.glDrawRangeElements(mode, start, end, count, type, offset);
	}

	public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border,
			int format, int type, java.nio.Buffer pixels) {
		gl.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
	}

	public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border,
			int format, int type, int offset) {
		gl.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, offset);
	}

	public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height,
			int depth, int format, int type, java.nio.Buffer pixels) {
		gl.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height,
			int depth, int format, int type, int offset) {
		gl.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, offset);
	}

	public void glCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y,
			int width, int height) {
		gl.glCopyTexSubImage3D(target, level, xoffset, yoffset, zoffset, x, y, width, height);
	}

	public void glGenQueries(int n, int[] ids, int offset) {
		gl.glGenQueries(n, ids, offset);
	}

	public void glGenQueries(int n, java.nio.IntBuffer ids) {
		gl.glGenQueries(n, ids);
	}

	public void glDeleteQueries(int n, int[] ids, int offset) {
		gl.glDeleteQueries(n, ids, offset);
	}

	public void glDeleteQueries(int n, java.nio.IntBuffer ids) {
		gl.glDeleteQueries(n, ids);
	}

	public boolean glIsQuery(int id) {
		return gl.glIsQuery(id);
	}

	public void glBeginQuery(int target, int id) {
		gl.glBeginQuery(target, id);
	}

	public void glEndQuery(int target) {
		gl.glEndQuery(target);
	}

	public void glGetQueryiv(int target, int pname, java.nio.IntBuffer params) {
		gl.glGetQueryiv(target, pname, params);
	}

	public void glGetQueryObjectuiv(int id, int pname, java.nio.IntBuffer params) {
		gl.glGetQueryObjectuiv(id, pname, params);
	}

	public boolean glUnmapBuffer(int target) {
		return gl.glUnmapBuffer(target);
	}

	public java.nio.Buffer glGetBufferPointerv(int target, int pname) {
		return gl.glGetBufferPointerv(target, pname);
	}

	public void glDrawBuffers(int n, java.nio.IntBuffer bufs) {
		gl.glDrawBuffers(n, bufs);
	}

	public void glUniformMatrix2x3fv(int location, int count, boolean transpose, java.nio.FloatBuffer value) {
		gl.glUniformMatrix2x3fv(location, count, transpose, value);
	}

	public void glUniformMatrix3x2fv(int location, int count, boolean transpose, java.nio.FloatBuffer value) {
		gl.glUniformMatrix3x2fv(location, count, transpose, value);
	}

	public void glUniformMatrix2x4fv(int location, int count, boolean transpose, java.nio.FloatBuffer value) {
		gl.glUniformMatrix2x4fv(location, count, transpose, value);
	}

	public void glUniformMatrix4x2fv(int location, int count, boolean transpose, java.nio.FloatBuffer value) {
		gl.glUniformMatrix4x2fv(location, count, transpose, value);
	}

	public void glUniformMatrix3x4fv(int location, int count, boolean transpose, java.nio.FloatBuffer value) {
		gl.glUniformMatrix3x4fv(location, count, transpose, value);
	}

	public void glUniformMatrix4x3fv(int location, int count, boolean transpose, java.nio.FloatBuffer value) {
		gl.glUniformMatrix4x3fv(location, count, transpose, value);
	}

	public void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1,
			int dstY1, int mask, int filter) {
		gl.glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
	}

	public void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height) {
		gl.glRenderbufferStorageMultisample(target, samples, internalformat, width, height);
	}

	public void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
		gl.glFramebufferTextureLayer(target, attachment, texture, level, layer);
	}

	public void glFlushMappedBufferRange(int target, int offset, int length) {
		gl.glFlushMappedBufferRange(target, offset, length);
	}

	public void glBindVertexArray(int array) {
		gl.glBindVertexArray(array);
	}

	public void glDeleteVertexArrays(int n, int[] arrays, int offset) {
		gl.glDeleteVertexArrays(n, arrays, offset);
	}

	public void glDeleteVertexArrays(int n, java.nio.IntBuffer arrays) {
		gl.glDeleteVertexArrays(n, arrays);
	}

	public void glGenVertexArrays(int n, int[] arrays, int offset) {
		gl.glGenVertexArrays(n, arrays, offset);
	}

	public void glGenVertexArrays(int n, java.nio.IntBuffer arrays) {
		gl.glGenVertexArrays(n, arrays);
	}

	public boolean glIsVertexArray(int array) {
		return gl.glIsVertexArray(array);
	}

	public void glBeginTransformFeedback(int primitiveMode) {
		gl.glBeginTransformFeedback(primitiveMode);
	}

	public void glEndTransformFeedback() {
		gl.glEndTransformFeedback();
	}

	public void glBindBufferRange(int target, int index, int buffer, int offset, int size) {
		gl.glBindBufferRange(target, index, buffer, offset, size);
	}

	public void glBindBufferBase(int target, int index, int buffer) {
		gl.glBindBufferBase(target, index, buffer);
	}

	public void glTransformFeedbackVaryings(int program, String[] varyings, int bufferMode) {
		gl.glTransformFeedbackVaryings(program, varyings, bufferMode);
	}

	public void glVertexAttribIPointer(int index, int size, int type, int stride, int offset) {
		gl.glVertexAttribIPointer(index, size, type, stride, offset);
	}

	public void glGetVertexAttribIiv(int index, int pname, java.nio.IntBuffer params) {
		gl.glGetVertexAttribIiv(index, pname, params);
	}

	public void glGetVertexAttribIuiv(int index, int pname, java.nio.IntBuffer params) {
		gl.glGetVertexAttribIuiv(index, pname, params);
	}

	public void glVertexAttribI4i(int index, int x, int y, int z, int w) {
		gl.glVertexAttribI4i(index, x, y, z, w);
	}

	public void glVertexAttribI4ui(int index, int x, int y, int z, int w) {
		gl.glVertexAttribI4ui(index, x, y, z, w);
	}

	public void glGetUniformuiv(int program, int location, java.nio.IntBuffer params) {
		gl.glGetUniformuiv(program, location, params);
	}

	public int glGetFragDataLocation(int program, String name) {
		return gl.glGetFragDataLocation(program, name);
	}

	public void glUniform1uiv(int location, int count, java.nio.IntBuffer value) {
		gl.glUniform1uiv(location, count, value);
	}

	public void glUniform3uiv(int location, int count, java.nio.IntBuffer value) {
		gl.glUniform3uiv(location, count, value);
	}

	public void glUniform4uiv(int location, int count, java.nio.IntBuffer value) {
		gl.glUniform4uiv(location, count, value);
	}

	public void glClearBufferiv(int buffer, int drawbuffer, java.nio.IntBuffer value) {
		gl.glClearBufferiv(buffer, drawbuffer, value);
	}

	public void glClearBufferuiv(int buffer, int drawbuffer, java.nio.IntBuffer value) {
		gl.glClearBufferuiv(buffer, drawbuffer, value);
	}

	public void glClearBufferfv(int buffer, int drawbuffer, java.nio.FloatBuffer value) {
		gl.glClearBufferfv(buffer, drawbuffer, value);
	}

	public void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil) {
		gl.glClearBufferfi(buffer, drawbuffer, depth, stencil);
	}

	public String glGetStringi(int name, int index) {
		return gl.glGetStringi(name, index);
	}

	public void glCopyBufferSubData(int readTarget, int writeTarget, int readOffset, int writeOffset, int size) {
		gl.glCopyBufferSubData(readTarget, writeTarget, readOffset, writeOffset, size);
	}

	public void glGetUniformIndices(int program, String[] uniformNames, java.nio.IntBuffer uniformIndices) {
		gl.glGetUniformIndices(program, uniformNames, uniformIndices);
	}

	public void glGetActiveUniformsiv(int program, int uniformCount, java.nio.IntBuffer uniformIndices, int pname,
			java.nio.IntBuffer params) {
		gl.glGetActiveUniformsiv(program, uniformCount, uniformIndices, pname, params);
	}

	public int glGetUniformBlockIndex(int program, String uniformBlockName) {
		return gl.glGetUniformBlockIndex(program, uniformBlockName);
	}

	public void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, java.nio.IntBuffer params) {
		gl.glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
	}

	public void glGetActiveUniformBlockName(int program, int uniformBlockIndex, java.nio.Buffer length,
			java.nio.Buffer uniformBlockName) {
		gl.glGetActiveUniformBlockName(program, uniformBlockIndex, length, uniformBlockName);
	}

	public String glGetActiveUniformBlockName(int program, int uniformBlockIndex) {
		return gl.glGetActiveUniformBlockName(program, uniformBlockIndex);
	}

	public void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
		gl.glUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding);
	}

	public void glDrawArraysInstanced(int mode, int first, int count, int instanceCount) {
		gl.glDrawArraysInstanced(mode, first, count, instanceCount);
	}

	public void glDrawElementsInstanced(int mode, int count, int type, int indicesOffset, int instanceCount) {
		gl.glDrawElementsInstanced(mode, count, type, indicesOffset, instanceCount);
	}

	public void glGetInteger64v(int pname, java.nio.LongBuffer params) {
		gl.glGetInteger64v(pname, params);
	}

	public void glGetBufferParameteri64v(int target, int pname, java.nio.LongBuffer params) {
		gl.glGetBufferParameteri64v(target, pname, params);
	}

	public void glGenSamplers(int count, int[] samplers, int offset) {
		gl.glGenSamplers(count, samplers, offset);
	}

	public void glGenSamplers(int count, java.nio.IntBuffer samplers) {
		gl.glGenSamplers(count, samplers);
	}

	public void glDeleteSamplers(int count, int[] samplers, int offset) {
		gl.glDeleteSamplers(count, samplers, offset);
	}

	public void glDeleteSamplers(int count, java.nio.IntBuffer samplers) {
		gl.glDeleteSamplers(count, samplers);
	}

	public boolean glIsSampler(int sampler) {
		return gl.glIsSampler(sampler);
	}

	public void glBindSampler(int unit, int sampler) {
		gl.glBindSampler(unit, sampler);
	}

	public void glSamplerParameteri(int sampler, int pname, int param) {
		gl.glSamplerParameteri(sampler, pname, param);
	}

	public void glSamplerParameteriv(int sampler, int pname, java.nio.IntBuffer param) {
		gl.glSamplerParameteriv(sampler, pname, param);
	}

	public void glSamplerParameterf(int sampler, int pname, float param) {
		gl.glSamplerParameterf(sampler, pname, param);
	}

	public void glSamplerParameterfv(int sampler, int pname, java.nio.FloatBuffer param) {
		gl.glSamplerParameterfv(sampler, pname, param);
	}

	public void glGetSamplerParameteriv(int sampler, int pname, java.nio.IntBuffer params) {
		gl.glGetSamplerParameteriv(sampler, pname, params);
	}

	public void glGetSamplerParameterfv(int sampler, int pname, java.nio.FloatBuffer params) {
		gl.glGetSamplerParameterfv(sampler, pname, params);
	}

	public void glVertexAttribDivisor(int index, int divisor) {
		gl.glVertexAttribDivisor(index, divisor);
	}

	public void glBindTransformFeedback(int target, int id) {
		gl.glBindTransformFeedback(target, id);
	}

	public void glDeleteTransformFeedbacks(int n, int[] ids, int offset) {
		gl.glDeleteTransformFeedbacks(n, ids, offset);
	}

	public void glDeleteTransformFeedbacks(int n, java.nio.IntBuffer ids) {
		gl.glDeleteTransformFeedbacks(n, ids);
	}

	public void glGenTransformFeedbacks(int n, int[] ids, int offset) {
		gl.glGenTransformFeedbacks(n, ids, offset);
	}

	public void glGenTransformFeedbacks(int n, java.nio.IntBuffer ids) {
		gl.glGenTransformFeedbacks(n, ids);
	}

	public boolean glIsTransformFeedback(int id) {
		return gl.glIsTransformFeedback(id);
	}

	public void glPauseTransformFeedback() {
		gl.glPauseTransformFeedback();
	}

	public void glResumeTransformFeedback() {
		gl.glResumeTransformFeedback();
	}

	public void glProgramParameteri(int program, int pname, int value) {
		gl.glProgramParameteri(program, pname, value);
	}

	public void glInvalidateFramebuffer(int target, int numAttachments, java.nio.IntBuffer attachments) {
		gl.glInvalidateFramebuffer(target, numAttachments, attachments);
	}

	public void glInvalidateSubFramebuffer(int target, int numAttachments, java.nio.IntBuffer attachments, int x, int y,
			int width, int height) {
		gl.glInvalidateSubFramebuffer(target, numAttachments, attachments, x, y, width, height);
	}

}
