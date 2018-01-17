// Copyright 2018 Yahoo Holdings. Licensed under the terms of the Apache 2.0 license. See LICENSE in the project root.
package com.yahoo.documentapi.messagebus.protocol;

import com.yahoo.vespa.objects.Deserializer;

public class RoutableFactories60 extends RoutableFactories52 {

    public static class CreateVisitorMessageFactory extends RoutableFactories52.CreateVisitorMessageFactory {
        @Override
        protected String decodeBucketSpace(Deserializer deserializer) {
            // TODO le test~
            return super.decodeBucketSpace(deserializer);
        }

        @Override
        protected boolean encodeBucketSpace(String bucketSpace) {
            // TODO le test~
            return super.encodeBucketSpace(bucketSpace);
        }
    }

}
