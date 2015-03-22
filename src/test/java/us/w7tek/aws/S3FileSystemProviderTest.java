package us.w7tek.aws;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.spi.FileSystemProvider;
import java.util.Collections;

import static org.junit.Assert.assertSame;

public class S3FileSystemProviderTest {

    private FileSystemProvider mFileSystemProvider;

    @Before
    public void setUp() throws Exception {
        URI uri = new URI("s3://w7tek-test-bucket/some/path");
        FileSystem fileSystem = FileSystems.newFileSystem(uri, Collections.<String, Object>emptyMap());
        mFileSystemProvider = fileSystem.provider();
        fileSystem.close();
    }

    @After
    public void tearDown() throws Exception {
        mFileSystemProvider = null;
    }

    @Test
    public void testGetScheme() throws Exception {
        assertSame(S3FileSystemProvider.SCHEME, mFileSystemProvider.getScheme());
    }

    @Test
    public void testNewFileSystem() throws Exception {
    }

    @Test
    public void testGetFileSystem() throws Exception {

    }

    @Test
    public void testGetPath() throws Exception {

    }

    @Test
    public void testNewByteChannel() throws Exception {

    }

    @Test
    public void testNewDirectoryStream() throws Exception {

    }

    @Test
    public void testCreateDirectory() throws Exception {

    }

    @Test
    public void testDelete() throws Exception {

    }

    @Test
    public void testCopy() throws Exception {

    }

    @Test
    public void testMove() throws Exception {

    }

    @Test
    public void testIsSameFile() throws Exception {

    }

    @Test
    public void testIsHidden() throws Exception {

    }

    @Test
    public void testGetFileStore() throws Exception {

    }

    @Test
    public void testCheckAccess() throws Exception {

    }

    @Test
    public void testGetFileAttributeView() throws Exception {

    }

    @Test
    public void testReadAttributes() throws Exception {

    }

    @Test
    public void testReadAttributes1() throws Exception {

    }

    @Test
    public void testSetAttribute() throws Exception {

    }
}