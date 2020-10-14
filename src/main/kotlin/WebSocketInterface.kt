import io.javalin.websocket.*
import java.util.function.Consumer

interface WebSocketInterface: Consumer<WsHandler> {

    fun connectHandler(ctx: WsConnectContext)
    fun errorHandler(ctx: WsErrorContext)
    fun closeHandler(ctx: WsCloseContext)
    fun messageHandler(ctx: WsMessageContext)

    override fun accept(ws: WsHandler) {
        ws.onConnect(::connectHandler)
        ws.onError(::errorHandler)
        ws.onClose(::closeHandler)
        ws.onMessage(::messageHandler)
    }
}