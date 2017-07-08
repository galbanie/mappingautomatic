package com.github.galbanie.mapauto.view

import javafx.scene.control.MenuBar
import tornadofx.*
import kotlin.system.exitProcess

class MappingAutomaticMasterView : View("Hello TornadoFX") {
    override val root = borderpane {
        top{
            menubar {
                menu("Mapping Automatic") {
                    item("Preferences")
                    separator()
                    item("Quit"){
                        action {
                           exitProcess(0)
                        }
                    }
                }
                menu("File") {
                    item("Open")
                    separator()
                    menu("Export") {
                        item("JSON")
                        item("XML")
                    }
                }
            }
        }
        center{
            form {
                fieldset {
                    field {

                    }
                }
            }
        }
    }
}