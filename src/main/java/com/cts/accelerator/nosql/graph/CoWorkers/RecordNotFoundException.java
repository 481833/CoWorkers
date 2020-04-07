package com.cts.accelerator.nosql.graph.CoWorkers;

public class RecordNotFoundException extends RuntimeException {

        private static final long serialVersionUID = 1L;

        public RecordNotFoundException(String message) {
            super(message);
        }
}
