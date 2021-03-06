/*
 *   Copyright (c) 2012 Mike Heath.  All rights reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package nats.codec;

import org.jboss.netty.buffer.ChannelBuffer;

/**
 * @author Mike Heath <elcapo@gmail.com>
 */
class AbstractPong {

	public static final String CMD_PONG = "PONG";
	private static final ChannelBuffer PONG_BUFFER = ChannelBufferUtil.wrappedBuffer(CMD_PONG + "\r\n");

	public ChannelBuffer encode() {
		return PONG_BUFFER.duplicate();
	}
}
