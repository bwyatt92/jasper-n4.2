//
// Copyright (c) 2023, Andy Frank
// Licensed under the MIT License
//
// History:
//   19 Jan 2023  Andy Frank  Creation
//

package jasper.service;

import java.util.*;
import javax.baja.sys.*;

/**
 * JasperPoint.
 */
public final class JasperPoint
{
  /** Constructor */
  public JasperPoint(String id, String name, String path, String enums, String unit)
  {
    this.id    = id;
    this.name  = name;
    this.path  = path;
    this.enums = enums;
    this.unit  = unit;
  }

  /** Unique id for this point. */
  public final String id;

  /** Name of this point. */
  public final String name;

  /** Path of this point. */
  public final String path;

  /** Enum ordinal names for this point or null if not defined. */
  public final String enums;

  /** Unit for this point or null if not defined. */
  public final String unit;
}