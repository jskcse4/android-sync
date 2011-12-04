package org.mozilla.android.sync.test.helpers;

import org.mozilla.android.sync.repositories.delegates.RepositorySessionFinishDelegate;

public class DefaultFinishDelegate extends DefaultDelegate implements RepositorySessionFinishDelegate {

  @Override
  public void onFinishFailed(Exception ex) {
    sharedFail("Finish failed");
  }

  @Override
  public void onFinishSucceeded() {
    sharedFail("Hit default finish delegate");
  }

}
