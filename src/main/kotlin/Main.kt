import io.javalin.Javalin

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val app = Javalin
            .create()
            .ws("camera", CameraSocket)
            .ws("controller", ControllerSocket)
            .start(33551)
    }
}