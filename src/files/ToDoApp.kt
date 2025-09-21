package files
import java.io.File

fun main() {
    val file = File("toDo.txt")
    println("Добро пожаловать в ToDo приложение!")

    while(true) {
        print("Введите задачу (или 0 для выхода): ")
        val userInput = readln()
        if (userInput == "0")
            break
        else{
            file.appendText("$userInput\n")
            println("Задача сохранена!")
        }
    }

    println("\nВаш список задач: ")
    println(file.readText())
}