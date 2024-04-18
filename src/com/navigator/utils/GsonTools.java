package com.navigator.utils;

import com.google.gson.Gson;

public class GsonTools {

  private static Gson gson;

  static {
    gson = new Gson();
  }

  public static String success(String status, String message, Object data) {
    Response resp = new Response(status, message, data);
    return gson.toJson(resp);
  }

  public static String success(String message, Object data) {
    return success("success", message, data);
  }

  public static String success(String message) {
    return success("success", message, null);
  }

}
