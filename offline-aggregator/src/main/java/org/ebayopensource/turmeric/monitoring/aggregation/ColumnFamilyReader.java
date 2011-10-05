package org.ebayopensource.turmeric.monitoring.aggregation;

import java.util.Date;
import java.util.List;

public abstract class ColumnFamilyReader {
   protected Date startTime;
   protected Date endTime;
   protected CassandraConnectionInfo connectionInfo;

   public ColumnFamilyReader(Date startTime, Date endTime, CassandraConnectionInfo connectionInfo) {
      super();
      this.startTime = startTime;
      this.endTime = endTime;
      this.connectionInfo = connectionInfo;
   }

   public Object read(CassandraConnectionInfo conInfo) {

      return null;
   }

   public abstract List retrieveKeysInRange();

}
