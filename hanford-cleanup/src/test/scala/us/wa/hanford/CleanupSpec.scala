/**
 * © 2013 Simple Finance Technology Corp. All rights reserved.
 * Author: Ian Eure <ieure@simple.com>
 */
package us.wa.hanford.test

import com.simple.simplespec.Spec
import org.junit.Test
import us.wa.hanford.Cleanup

class CleanupSpec extends Spec {
  class `The cleanup` {
    @Test def `is a process` {
      Cleanup().must(be("cleanup"))
    }
  }
}
