package cn.xvkang.phone.netty;

import cn.xvkang.phone.netty.protobuf.MyMessage;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;

public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {
	public MyChannelInitializer() {
		System.out.println("MyChannelInitializer6() constructor");
	}

	@Override
	protected void initChannel(SocketChannel ch) throws Exception {
		ChannelPipeline channelPipeline = ch.pipeline();
		channelPipeline.addLast(new ProtobufVarint32FrameDecoder());
		channelPipeline.addLast(new ProtobufDecoder(MyMessage.Data.getDefaultInstance()));
		channelPipeline.addLast(new ProtobufVarint32LengthFieldPrepender());
		channelPipeline.addLast(new ProtobufEncoder());
		channelPipeline.addLast(new MyChannelHandler());

	}
}
