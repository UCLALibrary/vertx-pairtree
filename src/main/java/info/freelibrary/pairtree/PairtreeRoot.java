
package info.freelibrary.pairtree;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

public interface PairtreeRoot {

    public static final String DEFAULT_PAIRTREE_NAME = "pairtree";

    public static final String PT_VERSION_NUM = "0.1";

    public static final String PAIRTREE_PREFIX = "pairtree_prefix";

    public static final String PAIRTREE_ROOT = "pairtree_root";

    public static final String PAIRTREE_VERSION = "pairtree_version";

    public static final String DEFAULT_CHARSET = "UTF-8";

    /**
     * Gets the Pairtree prefix.
     *
     * @return The Pairtree prefix
     */
    public String getPrefix();

    /**
     * Returns whether the Pairtree is using a prefix.
     */
    public boolean hasPrefix();

    /**
     * Gets the name of the Pairtree prefix file.
     *
     * @return The name of the Pairtree prefix file
     */
    public String getPrefixFileName();

    /**
     * Gets the path of the Pairtree prefix file.
     *
     * @return The path of the Pairtree prefix file or null if no prefix is set
     */
    public String getPrefixFilePath();

    /**
     * Gets the name of the Pairtree version file.
     *
     * @return The name of the Pairtree version file
     */
    public String getVersionFileName();

    /**
     * Gets the path of the Pairtree version file.
     *
     * @return The path of the Pairtree version file
     */
    public String getVersionFilePath();

    /**
     * Gets the Pairtree object identified by the supplied ID.
     *
     * @param aID An object name
     * @return The Pairtree object
     */
    public PairtreeObject getObject(final String aID);

    /**
     * Tests whether the Pairtree root exists.
     *
     * @param aHandler A {@link io.vertx.core.Handler} with an {@link io.vertx.core.AsyncResult}
     */
    public void exists(final Handler<AsyncResult<Boolean>> aHandler);

    /**
     * Creates the Pairtree root file system.
     *
     * @param aHandler A {@link io.vertx.core.Handler} with an {@link io.vertx.core.AsyncResult}
     */
    public void create(final Handler<AsyncResult<Void>> aHandler);

    /**
     * Deletes the Pairtree.
     *
     * @param aHandler A {@link io.vertx.core.Handler} with an {@link io.vertx.core.AsyncResult}
     */
    public void delete(final Handler<AsyncResult<Void>> aHandler);

    /**
     * Returns the implementation specific path of the Pairtree.
     */
    public String getPath();

}
