package io.uiza.net;

import java.util.Map;
import com.google.gson.JsonElement;
import io.uiza.exception.UizaException;
import io.uiza.net.ApiResource.RequestMethod;
import io.uiza.net.ApiResource.RequestType;

public interface UizaResponseGetter {

  /**
   * @param method The request method (GET, POST, PUT, DELETE)
   * @param url The base url of a request
   * @param params The Map object of request parameters
   * @param type The type of a request (NORMAL, MULTIPART)
   * @return response of an API request
   */
  JsonElement request(RequestMethod method, String url, Map<String, Object> params,
      RequestType type) throws UizaException;
}
