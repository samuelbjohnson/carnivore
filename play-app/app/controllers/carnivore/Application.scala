package controllers.carnivore

import play.api.mvc.{Action, Controller}

/**
 * Created by Samuel B. Johnson on 6/18/15.
 * Unless specified elsewhere, this code is copyright 2015
 * and is licensed under the terms of the AGPL 3.0
 */

class Application extends Controller {

  def index = Action {
    Ok(views.html.carnivore.index("Carnivore"))
  }

}