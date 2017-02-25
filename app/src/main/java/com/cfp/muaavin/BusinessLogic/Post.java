package com.cfp.muaavin.BusinessLogic;

import java.io.Serializable;

/**
 *
 */
public class Post implements Serializable {

 public String id;
 public String message;
 public String image;
 public String postUrl;

 public Post()
  {
    id = "";
    message = "";
    image = "";
    postUrl = "";

  }


}
