package cn.xvkang.config;

import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.nio.NioEventLoopGroup;

/**
 * Created by Arthur Asatryan. Date: 1/31/18 Time: 4:14 PM
 */
@Configuration
public class ServerConfiguration {

	private static final Logger LOGGER = LoggerFactory.getLogger(ServerConfiguration.class);

	// region Dependencies
	@Value("${spring.netty.host.port}")
	private int tcpPort;

	@Autowired
	private ServerBootstrap serverBootstrap;

	@Autowired
	private NioEventLoopGroup bossGroup;

	@Autowired
	private NioEventLoopGroup workerGroup;
	// endregion

	// region Public method
	@Bean(name = "serverChannel")
	public Channel serverChannel() throws InterruptedException {
		LOGGER.debug("Starting server on port - {}", tcpPort);
		return serverBootstrap.bind(tcpPort).sync().channel().closeFuture().channel();
	}

	@PreDestroy
	public void stop() throws InterruptedException {
		LOGGER.debug("Closing server channel");
		try {
			serverChannel().close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		LOGGER.debug("Closing server channel's parent");
		try {
			serverChannel().parent().close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		LOGGER.debug("Shutting down boss group");
		try {
			bossGroup.shutdownGracefully();
		} catch (Exception e) {
			e.printStackTrace();
		}
		LOGGER.debug("Shutting down worker group");
		try {
			workerGroup.shutdownGracefully();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// endregion

}
