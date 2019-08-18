package net.aridai.mytornadofx.core.ui

import javafx.scene.layout.BorderPane
import tornadofx.View

class MyView : View(title = "MyTornadoFX") {
    override val root: BorderPane by fxml("/fxml/MyView.fxml")
}
