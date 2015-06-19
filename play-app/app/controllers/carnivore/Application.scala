package controllers.carnivore

import play.api.mvc.{Action, Controller}

class Application extends Controller {

	def index = Action {
		Ok(views.html.carnivore.index("Carnivore"))
	}

}