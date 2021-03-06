package com.lmax.disruptor;

import java.util.concurrent.TimeUnit;

public abstract interface SequenceBarrier
{
  public abstract void alert();

  public abstract void checkAlert()
    throws AlertException;

  public abstract void clearAlert();

  public abstract long getCursor();

  public abstract boolean isAlerted();

  public abstract long waitFor(long paramLong)
    throws AlertException, InterruptedException;

  public abstract long waitFor(long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
    throws AlertException, InterruptedException;
}

/* Location:           /Users/zhangxun-xy/Downloads/qingting2/classes_dex2jar.jar
 * Qualified Name:     com.lmax.disruptor.SequenceBarrier
 * JD-Core Version:    0.6.2
 */