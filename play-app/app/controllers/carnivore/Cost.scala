package controllers.carnivore

/**
 * @author AJP
 */

import play.api.mvc.{Action, Controller}
import play.api.libs.json._

class Cost extends Controller {
  def calc = Action { request => 
    def cost = request.queryString.get("salePrice")
    if(cost != None){
    	Ok(Json.obj("cost" -> cost.get(0).toDouble ))
    } else {
      Ok(Json.obj("error" -> "You must supply a salePrice!"))
    }
  }
  
  def calcAll(cost: Double, rebateAmount: Double) = Action { request =>
    Ok(Json.obj("costAll" -> (cost - rebateAmount)))
  }
  
}