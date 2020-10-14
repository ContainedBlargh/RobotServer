import io.javalin.websocket.WsCloseContext
import io.javalin.websocket.WsConnectContext
import io.javalin.websocket.WsErrorContext
import io.javalin.websocket.WsMessageContext

object ControllerSocket: WebSocketInterface {

    override fun connectHandler(ctx: WsConnectContext) {
        val addr = ctx.session.remoteAddress
        println("Controller connected from $addr!")
        ctx.send("Welcome $addr!")
    }

    override fun errorHandler(ctx: WsErrorContext) {
        println("An error occurred!")
        ctx.error()?.let {
            throw it
        }
    }

    override fun closeHandler(ctx: WsCloseContext) {
        println("Controller from ${ctx.session.remoteAddress} left!")
    }

    override fun messageHandler(ctx: WsMessageContext) {
        println("Controller from ${ctx.session.remoteAddress} said: ${ctx.message()}")
        ctx.send("We hear you loud and clear ${ctx.session.remoteAddress}!")
    }
}