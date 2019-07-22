package cn.xvkang.phone.netty;

import cn.xvkang.phone.netty.protobuf.MyMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * 
 * @author wu
 *
 */
public class MyChannelHandler extends SimpleChannelInboundHandler<MyMessage.Data> {

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, MyMessage.Data msg) throws Exception {
		MyMessage.Data.DataType dataType = msg.getDataType();
		if (dataType == MyMessage.Data.DataType.CLOSE) {
			String number = msg.getCloseData().getNumber();
			System.out.println("服务器收到：" + number);
		} else if (dataType == MyMessage.Data.DataType.OPEN) {
			MyMessage.Open open = msg.getOpenData();
			String email = open.getEmail();
			System.out.println("服务器收到：" + email);
		}

	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		super.exceptionCaught(ctx, cause);
		cause.printStackTrace();
		ctx.close();
	}

	@Override
	public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
		super.handlerAdded(ctx);

		System.out.println("handlerAdded,channel's id:" + ctx.channel().id().asLongText());
	}

	@Override
	public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
		super.channelRegistered(ctx);
		System.out.println("channelRegistered");
	}

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		super.channelActive(ctx);

		System.out.println("channelActive:" + ctx.channel().remoteAddress() + " 上线");
	}

	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		super.channelInactive(ctx);

		System.out.println("channelInactive:" + ctx.channel().remoteAddress() + " 掉线");
	}

	@Override
	public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
		super.channelUnregistered(ctx);
		System.out.println("channelUnregistered");
	}

	@Override
	public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
		super.handlerRemoved(ctx);

		System.out.println("handlerRemoved");
	}
}