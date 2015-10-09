package controllers.carnivore

/**
 * @author AJP
 */

import play.api.mvc.{Action, Controller}
import play.api.libs.json._

class Cost extends Controller {
  def calc = Action { request => 
    Ok(Json.obj("cost" -> 123.45))
  }
  
}