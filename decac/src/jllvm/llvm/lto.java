/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package jllvm.llvm;

public class lto implements ltoConstants {
  public static String lto_get_version() {
    return ltoJNI.lto_get_version();
  }

  public static String lto_get_error_message() {
    return ltoJNI.lto_get_error_message();
  }

  public static boolean lto_module_is_object_file(String path) {
    return ltoJNI.lto_module_is_object_file(path);
  }

  public static boolean lto_module_is_object_file_for_target(String path, String target_triple_prefix) {
    return ltoJNI.lto_module_is_object_file_for_target(path, target_triple_prefix);
  }

  public static boolean lto_module_is_object_file_in_memory(SWIGTYPE_p_void mem, long length) {
    return ltoJNI.lto_module_is_object_file_in_memory(SWIGTYPE_p_void.getCPtr(mem), length);
  }

  public static boolean lto_module_is_object_file_in_memory_for_target(SWIGTYPE_p_void mem, long length, String target_triple_prefix) {
    return ltoJNI.lto_module_is_object_file_in_memory_for_target(SWIGTYPE_p_void.getCPtr(mem), length, target_triple_prefix);
  }

  public static SWIGTYPE_p_LTOModule lto_module_create(String path) {
    long cPtr = ltoJNI.lto_module_create(path);
    return (cPtr == 0) ? null : new SWIGTYPE_p_LTOModule(cPtr, false);
  }

  public static SWIGTYPE_p_LTOModule lto_module_create_from_memory(SWIGTYPE_p_void mem, long length) {
    long cPtr = ltoJNI.lto_module_create_from_memory(SWIGTYPE_p_void.getCPtr(mem), length);
    return (cPtr == 0) ? null : new SWIGTYPE_p_LTOModule(cPtr, false);
  }

  public static void lto_module_dispose(SWIGTYPE_p_LTOModule mod) {
    ltoJNI.lto_module_dispose(SWIGTYPE_p_LTOModule.getCPtr(mod));
  }

  public static String lto_module_get_target_triple(SWIGTYPE_p_LTOModule mod) {
    return ltoJNI.lto_module_get_target_triple(SWIGTYPE_p_LTOModule.getCPtr(mod));
  }

  public static long lto_module_get_num_symbols(SWIGTYPE_p_LTOModule mod) {
    return ltoJNI.lto_module_get_num_symbols(SWIGTYPE_p_LTOModule.getCPtr(mod));
  }

  public static String lto_module_get_symbol_name(SWIGTYPE_p_LTOModule mod, long index) {
    return ltoJNI.lto_module_get_symbol_name(SWIGTYPE_p_LTOModule.getCPtr(mod), index);
  }

  public static lto_symbol_attributes lto_module_get_symbol_attribute(SWIGTYPE_p_LTOModule mod, long index) {
    return lto_symbol_attributes.swigToEnum(ltoJNI.lto_module_get_symbol_attribute(SWIGTYPE_p_LTOModule.getCPtr(mod), index));
  }

  public static SWIGTYPE_p_LTOCodeGenerator lto_codegen_create() {
    long cPtr = ltoJNI.lto_codegen_create();
    return (cPtr == 0) ? null : new SWIGTYPE_p_LTOCodeGenerator(cPtr, false);
  }

  public static void lto_codegen_dispose(SWIGTYPE_p_LTOCodeGenerator arg0) {
    ltoJNI.lto_codegen_dispose(SWIGTYPE_p_LTOCodeGenerator.getCPtr(arg0));
  }

  public static boolean lto_codegen_add_module(SWIGTYPE_p_LTOCodeGenerator cg, SWIGTYPE_p_LTOModule mod) {
    return ltoJNI.lto_codegen_add_module(SWIGTYPE_p_LTOCodeGenerator.getCPtr(cg), SWIGTYPE_p_LTOModule.getCPtr(mod));
  }

  public static boolean lto_codegen_set_debug_model(SWIGTYPE_p_LTOCodeGenerator cg, lto_debug_model arg1) {
    return ltoJNI.lto_codegen_set_debug_model(SWIGTYPE_p_LTOCodeGenerator.getCPtr(cg), arg1.swigValue());
  }

  public static boolean lto_codegen_set_pic_model(SWIGTYPE_p_LTOCodeGenerator cg, lto_codegen_model arg1) {
    return ltoJNI.lto_codegen_set_pic_model(SWIGTYPE_p_LTOCodeGenerator.getCPtr(cg), arg1.swigValue());
  }

  public static void lto_codegen_set_gcc_path(SWIGTYPE_p_LTOCodeGenerator cg, String path) {
    ltoJNI.lto_codegen_set_gcc_path(SWIGTYPE_p_LTOCodeGenerator.getCPtr(cg), path);
  }

  public static void lto_codegen_set_assembler_path(SWIGTYPE_p_LTOCodeGenerator cg, String path) {
    ltoJNI.lto_codegen_set_assembler_path(SWIGTYPE_p_LTOCodeGenerator.getCPtr(cg), path);
  }

  public static void lto_codegen_add_must_preserve_symbol(SWIGTYPE_p_LTOCodeGenerator cg, String symbol) {
    ltoJNI.lto_codegen_add_must_preserve_symbol(SWIGTYPE_p_LTOCodeGenerator.getCPtr(cg), symbol);
  }

  public static boolean lto_codegen_write_merged_modules(SWIGTYPE_p_LTOCodeGenerator cg, String path) {
    return ltoJNI.lto_codegen_write_merged_modules(SWIGTYPE_p_LTOCodeGenerator.getCPtr(cg), path);
  }

  public static SWIGTYPE_p_void lto_codegen_compile(SWIGTYPE_p_LTOCodeGenerator cg, SWIGTYPE_p_size_t length) {
    long cPtr = ltoJNI.lto_codegen_compile(SWIGTYPE_p_LTOCodeGenerator.getCPtr(cg), SWIGTYPE_p_size_t.getCPtr(length));
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static void lto_codegen_debug_options(SWIGTYPE_p_LTOCodeGenerator cg, String arg1) {
    ltoJNI.lto_codegen_debug_options(SWIGTYPE_p_LTOCodeGenerator.getCPtr(cg), arg1);
  }

}
