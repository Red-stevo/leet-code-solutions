from PyQt5 import QtWidgets
from PyQt5.QtWidgets import QApplication, QMainWindow
import sys


class Demo(QMainWindow):
    def __init__(self):
        super(Demo, self).__init__()
        self.button = None
        self.label = None
        self.setWindowTitle("Demo App")
        self.setGeometry(0, 0, 300, 400)
        self.widow_init()

    def widow_init(self):
        self.label = QtWidgets.QLabel(self)
        self.label.setText("Am a label")
        self.label.move(100, 200)

        self.button = QtWidgets.QPushButton(self)
        self.button.setText("Click me")
        self.button.move(200, 200)
        self.button.clicked.connect(self.button_action)

    def button_action(self):
        self.label.setText("Updated the text")


def window():
    app = QApplication(sys.argv)
    win = Demo()

    win.show()
    sys.exit(app.exec_())


window()
