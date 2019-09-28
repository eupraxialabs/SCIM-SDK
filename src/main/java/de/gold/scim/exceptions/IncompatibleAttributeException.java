package de.gold.scim.exceptions;

import lombok.Builder;


/**
 * author Pascal Knueppel <br>
 * created at: 28.09.2019 - 13:39 <br>
 * <br>
 * this exception is used if an attempt was made to read a json attribute that does have another type as the
 * expected one
 */
public class IncompatibleAttributeException extends ScimException
{

  @Builder
  public IncompatibleAttributeException(String message, Throwable cause, String detail, int status, String scimType)
  {
    super(message, cause, detail, status, scimType);
  }
}