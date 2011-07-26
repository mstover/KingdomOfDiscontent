package org.coinjema.kod
import scala.swing.MainFrame
import scala.swing.Label
import scala.swing.SwingApplication

/**
 * @author michael
 *
 */
object KodApp extends SwingApplication {

  /**
   * @param args
   */
  def startup(args: Array[String]): Unit = {
    val appWindow = new MainFrame {
      title = "Hello World Application";
      contents = new Label {
        text = "Hello World";
      }
    }
    packAndShow(appWindow)

  }

  /**
   *
   */
  private def packAndShow(appWindow: MainFrame): Unit = {
    appWindow pack;
    appWindow centerOnScreen;
    appWindow visible_= true;
  }
}
