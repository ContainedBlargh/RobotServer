import io.javalin.websocket.WsCloseContext
import io.javalin.websocket.WsConnectContext
import io.javalin.websocket.WsErrorContext
import io.javalin.websocket.WsMessageContext

object CameraSocket: WebSocketInterface {
    override fun connectHandler(ctx: WsConnectContext) {
        TODO("Not yet implemented")
    }

    override fun errorHandler(ctx: WsErrorContext) {
        TODO("Not yet implemented")
    }

    override fun closeHandler(ctx: WsCloseContext) {
        TODO("Not yet implemented")
    }

    override fun messageHandler(ctx: WsMessageContext) {
        TODO("Not yet implemented")
    }
}