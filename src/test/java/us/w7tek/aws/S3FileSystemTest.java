package us.w7tek.aws;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.Collections;

import static org.junit.Assert.assertTrue;

public class S3FileSystemTest {

    private FileSystem mFileSystem;

    @Before
    public void setUp() throws Exception {
        URI uri = new URI("s3://w7tek-test-bucket/some/path");
        mFileSystem = FileSystems.newFileSystem(uri, Collections.<String, Object>emptyMap());
    }

    @After
    public void tearDown() throws Exception {
        FileSystem fileSystem = mFileSystem;
        mFileSystem = null;
        fileSystem.close();
    }

    @Test
    public void testProvider() throws Exception {
        assertTrue(mFileSystem.provider() instanceof S3FileSystemProvider);
    }

    @Test
    public void testClose() throws Exception {

    }

    @Test
    public void testIsOpen() throws Exception {

    }

    @Test
    public void testIsReadOnly() throws Exception {

    }

    @Test
    public void testGetSeparator() throws Exception {

    }

    @Test
    public void testGetRootDirectories() throws Exception {

    }

    @Test
    public void testGetFileStores() throws Exception {

    }

    @Test
    public void testSupportedFileAttributeViews() throws Exception {

    }

    @Test
    public void testGetPath() throws Exception {

    }

    @Test
    public void testGetPathMatcher() throws Exception {

    }

    @Test
    public void testGetUserPrincipalLookupService() throws Exception {

    }

    @Test
    public void testNewWatchService() throws Exception {

    }
}