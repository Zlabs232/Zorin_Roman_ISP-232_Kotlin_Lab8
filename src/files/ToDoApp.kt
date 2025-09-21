package files
import java.io.File

fun main() {
    val file = File("demo.txt")

    println("Создаём или перезаписываем файл...")
    file.writeText("Привет!\n")
    println("Текущее содержимое файла:")
    println(file.readText())

    println("Добавим новую строку с помощью appendText...")
    file.appendText("Это новая строка!\n")
    println("Строка добавлена.")
    println("Текущее содержимое файла:")
    println(file.readText())

    println("Прочитаем файл построчно (readLines):")
    val lines = file.readLines()
    for ((index, line) in lines.withIndex()) {
        println("${index + 1}: $line")
    }
}