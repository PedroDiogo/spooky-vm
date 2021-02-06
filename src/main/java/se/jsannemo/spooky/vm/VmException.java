package se.jsannemo.spooky.vm;

/** Exception signifying a run-time error in the program executing in the VM. */
public class VmException extends Throwable {
  public VmException(String s) {
    super(s);
  }
}
