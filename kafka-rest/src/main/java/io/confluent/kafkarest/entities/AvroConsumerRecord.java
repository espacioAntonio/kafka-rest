/*
 * Copyright 2018 Confluent Inc.
 *
 * Licensed under the Confluent Community License; you may not use this file
 * except in compliance with the License.  You may obtain a copy of the License at
 *
 * http://www.confluent.io/confluent-community-license
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package io.confluent.kafkarest.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class AvroConsumerRecord extends ConsumerRecord<JsonNode, JsonNode> {

  @JsonCreator
  public AvroConsumerRecord(
      @JsonProperty("topic") String topic,
      @JsonProperty("key") JsonNode key, @JsonProperty("value") JsonNode value,
      @JsonProperty("partition") int partition, @JsonProperty("offset") long offset
  ) {
    super(topic, key, value, partition, offset);
  }

}
