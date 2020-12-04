package com.makeittotop.aws.kinesis;

import com.beust.jcommander.Parameter;

public class TwitterFanOutConsumerArgs {
    @Parameter(
            names = {"--shardId", "-sh"},
            description = "Shard ID",
            arity = 1,
            required = true
    )
    private String shardId;

    public String getShardId() {
        return shardId;
    }

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public String getStreamArn() {
        return streamArn;
    }

    public void setStreamArn(String streamArn) {
        this.streamArn = streamArn;
    }

    @Parameter(
            names = {"--consumerName", "-c"},
            description = "Consumer Name",
            arity = 1,
            required = false
    )
    private String consumerName;

    @Parameter(
            names = {"--streamArn", "-sa"},
            description = "AWS Data Stream ARN",
            arity = 1,
            required = true
    )
    private String streamArn;

    public boolean isHelp() {
        return help;
    }

    public void setHelp(boolean help) {
        this.help = help;
    }

    @Parameter(names = "--help", help = true)
    private boolean help;
}
