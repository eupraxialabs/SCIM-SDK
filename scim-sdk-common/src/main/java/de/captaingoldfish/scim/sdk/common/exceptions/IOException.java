package de.captaingoldfish.scim.sdk.common.exceptions;

import de.captaingoldfish.scim.sdk.common.constants.HttpStatus;


/**
 * author Pascal Knueppel <br>
 * created at: 28.09.2019 - 00:07 <br>
 * <br>
 * a simple runtime IO exception
 */
public class IOException extends ScimException
{

  public IOException(String message)
  {
    this(message, null, null, null);
  }

  public IOException(String message, Throwable cause)
  {
    this(message, cause, null, null);
  }

  public IOException(String message, Throwable cause, String scimType)
  {
    this(message, cause, null, scimType);
  }

  public IOException(String message, Throwable cause, Integer status)
  {
    this(message, cause, status, null);
  }

  public IOException(String message, Throwable cause, Integer status, String scimType)
  {
    super(message, cause, status == null ? HttpStatus.BAD_REQUEST : status, scimType);
  }
}
