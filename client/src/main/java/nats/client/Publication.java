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
package nats.client;

import nats.CompletionHandler;
import nats.NatsFuture;

/**
 * Represents a pending publish operation.
 *
 * @author Mike Heath <elcapo@gmail.com>
 */
public interface Publication extends NatsFuture<CompletionHandler<Publication>> {

	/**
	 * Returns the destination subject.
	 *
	 * @return the destination subject.
	 */
	String getSubject();

	/**
	 * Returns the message being published.
	 *
	 * @return the message being published.
	 */
	String getMessage();

	/**
	 * Returns the subject replies should be sent to.
	 *
	 * @return the subject replies should be sent to.
	 */
	String getReplyTo();
}
